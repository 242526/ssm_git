package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemsDao {

    //根据id来查询数据
    @Select("select * from items where id=#{id}")
    public Items findById(Integer id);


}
