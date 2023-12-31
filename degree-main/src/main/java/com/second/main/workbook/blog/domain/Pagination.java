package com.second.main.workbook.blog.domain;

import jakarta.validation.constraints.Max;

/**
 * 分页实体类
 */
public class Pagination {

    public static final int DEFAULT_PAGE_SIZE = 10;
    public static final int MAX_PAGE_SIZE = 100;
    private int page;
    private int pageSize;
    private long total;

    public Pagination() {
        this.page = 1;
        this.pageSize = 10;
        this.total = -9223372036854775808L;
    }

    public Pagination(int page, int pageSize) {
        this(page, pageSize, -9223372036854775808L);
    }

    public Pagination(int page, int pageSize, long total) {
        this.page = page;
        this.pageSize = pageSize;
        this.total = total;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Max(
            value = 100L,
            message = "{core.result.pagination.pageSize.Max.message}"
    )
    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
