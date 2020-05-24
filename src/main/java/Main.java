import enums.Category;
import enums.SexType;
import model.Item;
import model.Order;
import service.ItemService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item = new Item(1, "Asics III", "gel-lyte shoes", "green-yellow", 42, 8, 5750, Category.ADULT, SexType.MEN);
        Item item2 = new Item(2, "Asics V", "gel-lyte shoes", "triple-black", 43, 7, 5750, Category.ADULT, SexType.MEN);

        Order order = new Order(1, 2);
        Order order1 = new Order(2, 1);

        List<Order> orders = Arrays.asList(order, order1);
        List<Item> items = Arrays.asList(item,item2);
        ItemService itemService = new ItemService(items);
        itemService.getInfoById(1);
    }
}
