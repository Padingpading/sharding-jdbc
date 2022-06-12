package com.mashibing.shardingsphere.bean;

public class DictOrderType {

    private Long id;
    private String orderType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "DictOrderType{" +
                "id=" + id +
                ", orderType='" + orderType + '\'' +
                '}';
    }
}