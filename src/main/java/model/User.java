package model;

import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private List<Order> orders;

    public User(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(orders, user.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orders);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", orders=" + orders +
                '}';
    }
}
