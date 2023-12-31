package com.second.common.utils;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * {@code @author}  chou401
 * {@code @date} 2023/11/15
 * {@code @description} redis 加锁解锁 工具
 */
@Slf4j
@Component
public class RedisLockUtil {

//    private static final ScheduledExecutorService EXECUTOR_SERVICE = Executors.newScheduledThreadPool(4);

    @Resource
    private Redisson redisson;

    /**
     * Redisson获取锁
     *
     * @param lockKey      锁名
     * @param uuid         唯一标识
     * @param delaySeconds 过期时间
     * @param unit         单位
     * @return 是否获取成功
     */
    public boolean lock(String lockKey, final String uuid, long delaySeconds, final TimeUnit unit) {
        RLock rLock = redisson.getLock(lockKey);
        boolean success = false;
        try {
            // log.debug("===lock thread id is :{}", Thread.currentThread().getId());
            success = rLock.tryLock(0, delaySeconds, unit);
        } catch (InterruptedException e) {
            log.error("[RedisLock][lock]>>>> 加锁异常: ", e);
        }
        return success;
    }

    /**
     * Redisson释放锁
     *
     * @param lockKey 锁名
     */
    public void Unlock(String lockKey) {
        RLock rLock = redisson.getLock(lockKey);
        log.debug("[RedisLock][lock]>>>> {}, status: {} === unlock thread id is: {}", rLock.isHeldByCurrentThread(), rLock.isLocked(),
                Thread.currentThread().threadId());
        rLock.unlock();
    }

    /**
     * Redisson延迟释放锁
     *
     * @param lockKey   锁名
     * @param delayTime 延迟时间
     * @param unit      单位
     */
    public void delayUnlock(final String lockKey, long delayTime, TimeUnit unit) {
        if (!StringUtils.hasText(lockKey)) {
            return;
        }
        if (delayTime <= 0) {
            Unlock(lockKey);
        } else {
//            EXECUTOR_SERVICE.schedule(() -> Unlock(lockKey), delayTime, unit);
        }
    }


}
