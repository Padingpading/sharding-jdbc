package com.mashibing.shardingsphere.mapper;

import com.mashibing.shardingsphere.bean.Orders;
import com.mashibing.shardingsphere.bean.OrdersDetail;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrdersDetailMapper {


    @Insert("insert into t_orders_detail values(#{id},#{detail},#{order_id})")
    public void insertOrdersDetail(OrdersDetail ordersDetail);

    @Select("select * from t_orders_detail where id = #{id}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "detail",column = "detail"),
            @Result(property = "order_id",column = "order_id")
    })
    public OrdersDetail select(Integer id);

    @Select("select * from t_orders where id = #{id} and customer_id=#{customerId}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "orderType",column = "order_type"),
            @Result(property = "customerId",column = "customer_id"),
            @Result(property = "amount",column = "amount")
    })
    public Orders select2(Integer id,Integer customerId);
}
