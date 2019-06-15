package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("itemsService")
@Transactional
public class ItemsServiceImpl implements ItemsService {


    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        System.out.println("业务层findById执行了！");
        return itemsDao.findById(id);
    }
}
