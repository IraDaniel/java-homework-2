package com.company.task1;

import java.awt.*;

/**
 * Created by Ira on 15.12.2015.
 */
public class Pen {

    private Color color; // цвет



    private int price;


    public Pen(Color color,int price) {
        this.color = color;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (price != pen.price) return false;
        return !(color != null ? !color.equals(pen.color) : pen.color != null);

    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                ", price=" + price +
                '}';
    }

}
