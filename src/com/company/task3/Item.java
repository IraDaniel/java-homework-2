package com.company.task3;

import java.util.Comparator;

/**
 * Created by Ira on 15.12.2015.
 */
public abstract class Item {

    protected String name;
    protected Double price;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static Comparator<Item> getNameComparator() {
        return Comparator.comparing(Item::getName);
    }

    public static Comparator<Item> getPriceComparator() {
        return Comparator.comparing(Item::getPrice);
    }

    public static Comparator<Item> getPriceAndNameComparator() {
        return Comparator.comparing(Item::getPrice).thenComparing(Item::getName);
    }


}
