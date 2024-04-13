package com.self.checkout.system.app.facade;

import com.self.checkout.system.app.model.item.Item;

import java.util.List;

public interface ItemFacade {

    List<Item> getAllItems();

    List<Item> getAllItem();

    Item getItemById(int itemId);
}
