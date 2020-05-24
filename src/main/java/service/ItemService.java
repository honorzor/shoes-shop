package service;

import model.Item;

import java.util.List;

public class ItemService {

    private final List<Item> itemList;

    public ItemService(List<Item> itemList) {
        this.itemList = itemList;
    }



    public void getInfoById(int id) {
        if (getItemById(id)){
            for (Item item : itemList){
                if (item.getId() == id){
                    System.out.println(item.toString());
                }
            }
        }
    }

    private boolean getItemById (int id){
        for(Item item : itemList){
            if (item.getId() == id)
                return true;
        } return false;
    }
}
