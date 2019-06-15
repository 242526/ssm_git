package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class controllerItems {

    @Autowired
   private ItemsService itemsService;

    @RequestMapping("/finById")
    public String finById(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "items1";
    }
}
