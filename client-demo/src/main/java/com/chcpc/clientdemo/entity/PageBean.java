package com.chcpc.clientdemo.entity;

import java.util.List;

public class PageBean<T> {
    private int totalCount;
    private List<T> list;

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", list=" + list +
                '}';
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public PageBean(int totalCount, List<T> list) {
        this.totalCount = totalCount;
        this.list = list;
    }

    public PageBean() {
    }
}
