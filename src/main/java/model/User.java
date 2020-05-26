package model;

import java.util.Objects;

public class User {
    private String name;
    private Cart cart;


    public User(String name, Cart cart) {
        this.name = name;
        this.cart = cart;
    }
    public User(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(cart, user.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cart);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cart=" + cart +
                '}';
    }
}
