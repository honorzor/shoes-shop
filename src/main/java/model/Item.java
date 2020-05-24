package model;

import java.util.Objects;

public class Item {
    private int id;
    private String name;
    private String description;
    private String color;
    private int size;
    private int count;
    private int price;
    private Enum category;
    private Enum sex;


    public Item(int id, String name, String description, String color, int size, int count, int price, Enum category, Enum sex) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
        this.count = count;
        this.size = size;
        this.price = price;
        this.category = category;
        this.sex = sex;
    }

    public Item() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Enum getCategory() {
        return category;
    }

    public void setCategory(Enum category) {
        this.category = category;
    }

    public Enum getSex() {
        return sex;
    }

    public void setSex(Enum sex) {
        this.sex = sex;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                size == item.size &&
                count == item.count &&
                price == item.price &&
                Objects.equals(name, item.name) &&
                Objects.equals(description, item.description) &&
                Objects.equals(color, item.color) &&
                Objects.equals(category, item.category) &&
                Objects.equals(sex, item.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, color, size, count, price, category, sex);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", count=" + count +
                ", price=" + price +
                ", age=" + category +
                ", sex=" + sex +
                '}';
    }
}
