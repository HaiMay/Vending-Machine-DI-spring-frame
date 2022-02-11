/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m3ml.vendingmachine.dao;

import com.m3ml.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author quang
 */
public class VendingmachineDaoStubImpl implements VendingMachineDao {

    public Item onlyItem;

    public VendingmachineDaoStubImpl() {
        onlyItem = new Item("Coke");
        onlyItem.setCode("001");
        onlyItem.setPrice(new BigDecimal(1.30));
        onlyItem.setInventory(8);
    }

    public VendingmachineDaoStubImpl(Item testItem) {
        this.onlyItem = testItem;
    }

    @Override
    public void removeOneItemFromInventory(String code) throws VendingmachinePersistenceException {
        if (code.equals(onlyItem.getCode())) {
        } else {
        }
    }

    @Override
    public List<Item> getAllItems() throws VendingmachinePersistenceException {

        List<Item> itemList = new ArrayList<>();
        itemList.add(onlyItem);
        return itemList;

    }

    @Override
    public int getItemInventory(String code) throws VendingmachinePersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item getItem(String code) throws VendingmachinePersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, BigDecimal> getMapOfItemNamesInStockWithCosts() throws VendingmachinePersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
