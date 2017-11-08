package com.czg.shop.service.impl;


import com.czg.shop.mapper.ItemMapper;
import com.czg.shop.pojo.Item;
import com.czg.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类 名 称  ： ItemServiceImpl.class
 * 项目 名称 ：YiLiFang
 * 作    者 ：  czg
 * 日    期 ：  2017/11/8.
 * 作    用 ： 在这里写一句话描述作用
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item getItemById(long id) {
        Item item = itemMapper.selectByPrimaryKey(id);
        return item;
    }
}
