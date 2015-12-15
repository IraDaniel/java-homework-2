package com.company.task3;

/**
 * Created by Ira on 15.12.2015.
 */
public class AutomatPencil extends Pencil {

    private Double diameter; // диаметр грифеля

    public AutomatPencil(String name, Double price, int hardness, Double diameter) {
        super(name, price, hardness);
        this.diameter = diameter;
    }
}