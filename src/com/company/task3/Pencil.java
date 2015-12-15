package com.company.task3;

/**
 * Created by Ira on 15.12.2015.
 */
public class Pencil extends Item{

    private int hardness; // עגונהמסעü דנטפוכÿ

    public Pencil(String name, Double price, int hardness) {
        super(name, price);
        this.hardness = hardness;
    }
}
