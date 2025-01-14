package com.mashibing.shardingsphere.mapper;

import com.mashibing.shardingsphere.bean.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CustomerMapper {
    @Insert("insert into customer(id,name) values(#{id},#{name})")
    public void insertCustomer(Customer customer);
}