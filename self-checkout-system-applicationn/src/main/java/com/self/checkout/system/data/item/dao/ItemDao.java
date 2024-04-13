package com.self.checkout.system.data.item.dao;

import com.self.checkout.system.app.model.item.Item;

import java.util.List;

public interface ItemDao {
    List<Item> getAllItems();
    Item getItemById(int itemId);

    List<Item> getAllItem();
}
