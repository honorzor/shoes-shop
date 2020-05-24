import model.Item;
import model.Order;

import java.util.List;

public class Store {
    private List<Order> orders;
    private List<Item> items;

    public Store(List<Order> orders, List<Item> items) {
        this.orders = orders;
        this.items = items;
    }

}
