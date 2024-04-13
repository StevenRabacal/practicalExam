package com.self.checkout.system.app.facade.impl;

import com.self.checkout.system.app.facade.ItemFacade;
import com.self.checkout.system.app.model.item.Item;
import com.self.checkout.system.data.item.dao.ItemDao;

import java.util.List;

public class ItemFacadeImpl implements ItemFacade {


    private ItemDao ItemDao;
    public ItemFacadeImpl(ItemDao itemDao) {this.ItemDao = ItemDao;}



    @Override
    public List<Item> getAllItem() {return ItemDao.getAllItem();}

    @Override
    public Item getItemById(int ItemId) throws RuntimeException {
        return ItemDao.getItemById(ItemId);
    }


}

