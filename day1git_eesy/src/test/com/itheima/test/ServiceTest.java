package com.itheima.test;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    @Test//service
    public  void run(){

        //1.创建核心容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据id来获取对象
        ItemsService itemsService = ac.getBean(ItemsService.class);
        itemsService.findById(1);
    }

    @Test//mybatis
    public  void run1(){

        //1.创建核心容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.根据id来获取对象
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items);
    }
}
