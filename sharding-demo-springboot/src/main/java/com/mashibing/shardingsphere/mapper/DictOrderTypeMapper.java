package com.mashibing.shardingsphere.mapper;

import com.mashibing.shardingsphere.bean.DictOrderType;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DictOrderTypeMapper {

    @Insert("insert into dict_order_type(order_type) values(#{orderType})")
    public void insertDictOrderType(DictOrderType dictOrderType);

    @Delete("delete from dict_order_type where id = #{id}")
    public void DeleteDictOrderType(Integer id);
}