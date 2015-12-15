package com.company.task2;

/**
 * Created by Ira on 15.12.2015.
 */
public class Notebook {
    private int price;
    private int size;

    public Notebook(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}
