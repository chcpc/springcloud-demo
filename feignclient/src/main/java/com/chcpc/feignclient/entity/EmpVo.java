package com.chcpc.feignclient.entity;

public class EmpVo {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "EmpVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpVo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmpVo() {
    }
}
