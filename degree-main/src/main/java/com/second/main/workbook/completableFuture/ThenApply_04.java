package com.second.main.workbook.completableFuture;

import com.second.common.utils.ThreadTool;

import java.util.concurrent.CompletableFuture;

/**
 * {@code @author} chou401
 * {@code @date} 2023/3/29
 * {@code @className} ThenApply_04
 * {@code @description} thenApply
 * 把前面异步任务的结果，交给后面的function
 * 一个服务员操作收款、开发票
 */
public class ThenApply_04 {
    public static void main(String[] args) {
        ThreadTool.print("小白吃好了");
        ThreadTool.print("小白 结账、要求开发票");
        CompletableFuture<String> invoice = CompletableFuture.supplyAsync(() -> {
            ThreadTool.print("服务员收款 500元");
            ThreadTool.sleep(200);
            return "500";
        }).thenApply(money -> {
            ThreadTool.print(String.format("服务员开发票 面额 %s元", money));
            ThreadTool.sleep(200);
            return String.format("%s元发票", money);
        });

        ThreadTool.print("小白 街道朋友的电话，想一起打游戏");
        ThreadTool.print(String.format("小白拿到%s,准备回家", invoice.join()));
    }
}
