package com.self.checkout.system.data.item.dao.impl;

import com.self.checkout.system.app.model.item.Item;
import com.self.checkout.system.data.connection.ConnectionHelper;
import com.self.checkout.system.data.item.dao.ItemDao;
import com.self.checkout.system.data.utils.QueryConstants;
import org.junit.platform.commons.logging.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ItemDaoImpl implements ItemDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemDaoImpl.class);
    public ItemDaoImpl() {

    }
    @Override
    public List<Item> getAllItems() {
        List<Item> itemList = new ArrayList<>();
        String sql = "SELECT * FROM items";
        try (Connection con = new ConnectionHelper().getConnection()){
            PreparedStatement statement = con.prepareStatement(QueryConstants.GET_ALL_ITEMS_STATEMENT);
            ResultSet rs= statement.executeQuery();

            while (rs.next()) {
                Item item = new Item();
                item.setItemId(rs.getInt("item_id"));
                item.setItemDesc(rs.getString("item_desc"));
                item.setUnitPrice(rs.getDouble("unit_price"));
                item.setQty(rs.getInt("qty"));
                itemList.add(item);
            }
            LOGGER.info("Items retrieved successfully.");
        } catch (SQLException ex) {
            LOGGER.warn("Error retrieving all Employees." + e.getMessage());
            e.printStackTrace();
        }
        LOGGER.debug("Employee database is empty.");
        return itemList;
    }

    @Override
    public Item getItemById(int itemId) {
        Item item = null;
        try (Connection con = new ConnectionHelper().getConnection()) {
            PreparedStatement statement = con.prepareStatement(QueryConstants.GET_ITEM_BY_ID_STATEMENT);
            String id;
            statement.setString(1, id);
            ResultSet rs= statement.executeQuery();

            if(rs.next()) {
                LOGGER.debug("Item retrieved successfully.");
                item = setItem(rs);
            }

        } catch (SQLException ex) {
            LOGGER.error("An SQL Exception occurred." + ex.getMessage());
        }
        LOGGER.debug("Item not found.");
        return item;
    }



}


