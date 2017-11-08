package com.czg.shop.controller;


import com.czg.shop.pojo.Item;
import com.czg.shop.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类 名 称  ： ItemServiceImpl.class
 * 项目 名称 ：YiLiFang
 * 作    者 ：  czg
 * 日    期 ：  2017/11/8.
 * 作    用 ： 在这里写一句话描述作用
 */
@Controller
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private Item getItemById(@PathVariable Long itemId) {
        Item item = itemService.getItemById(itemId);
        return item;
    }
}