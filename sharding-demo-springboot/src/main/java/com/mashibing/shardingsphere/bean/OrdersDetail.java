package com.mashibing.shardingsphere.bean;

public class OrdersDetail {

    private Integer id;
    private String detail;
    private Integer order_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "OrdersDetail{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", order_id=" + order_id +
                '}';
    }
}
