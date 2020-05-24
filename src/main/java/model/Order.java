package model;

import java.util.Objects;

public class Order {
    private int idProduct;
    private int countProduct;

    public Order(int idProduct, int countProduct) {
        this.idProduct = idProduct;
        this.countProduct = countProduct;
    }

    public Order() {
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return idProduct == order.idProduct &&
                countProduct == order.countProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, countProduct);
    }

    @Override
    public String toString() {
        return "Order{" +
                "idProduct=" + idProduct +
                ", idCount=" + countProduct +
                '}';
    }
}

