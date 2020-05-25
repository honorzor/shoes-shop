package model;

import java.util.Map;
import java.util.Objects;

public class Order {
    private Map<Integer , Integer> orders;

    public Order(Map<Integer, Integer> orders) {
        this.orders = orders;
    }

    public Map<Integer, Integer> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Integer> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orders, order.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orders=" + orders +
                '}';
    }
}

