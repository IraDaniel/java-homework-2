package com.company.task3;

import java.awt.*;

/**
 * Created by Ira on 15.12.2015.
 */
public class Marker extends Item {
    private Color color;
    private double transparency;

    public Marker(String name, Double price, Color color, double transparency) {
        super(name, price);
        this.color = color;
        this.transparency = transparency;
    }
}
