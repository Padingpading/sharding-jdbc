package com.mashibing.shardingsphere.mapper;

import com.mashibing.shardingsphere.bean.Orders;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrdersMapper {


    @Insert("insert into orders values(#{id},#{orderType},#{customerId},#{amount})")
    public void insertOrders(Orders orders);

    @Select("select * from orders where id = #{id}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "orderType",column = "order_type"),
            @Result(property = "customerId",column = "customer_id"),
            @Result(property = "amount",column = "amount")
    })
    public Orders select(Integer id);

//    @Select("select * from t_orders where id = #{id} and customer_id=#{customerId}")
//    @Results({
//            @Result(property = "id",column = "id"),
//            @Result(property = "orderType",column = "order_type"),
//            @Result(property = "customerId",column = "customer_id"),
//            @Result(property = "amount",column = "amount")
//    })
//    public Orders select2(Integer id,Integer customerId);
}
