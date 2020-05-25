package stock;

import announcer.Announcer;
import enums.SexType;
import model.Item;
import model.Order;
import service.ItemService;
import service.OrderService;

import java.util.List;
import java.util.stream.Collectors;

public class Store implements ItemService, OrderService {
    private final List<Order> orders;
    private final List<Item> items;
    private final Announcer announcer;


    public Store(List<Order> orders, List<Item> items) {
        this.orders = orders;
        this.items = items;
        announcer = new Announcer();
    }


    @Override
    public void findById(int id) {
        for (Item i : items) {
            if (i.getId() == id) {
                announcer.info(i.toString());
            }
        }
    }

    @Override
    public void findBySex(SexType sexType) {
        List<Item> collect = items.stream().filter(i -> i.getSex().equals(sexType)).collect(Collectors.toList());
        announcer.info(collect);
    }

    @Override
    public void findByPrice(int from, int to) {
        List<Item> collect = items.stream().filter(item -> item.getPrice() >= from && item.getPrice() <= to).collect(Collectors.toList());
        announcer.info(collect);
    }
}
