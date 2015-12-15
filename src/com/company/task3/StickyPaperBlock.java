package com.company.task3;

import java.awt.*;

/**
 * Created by Ira on 15.12.2015.
 */
public class StickyPaperBlock extends PaperBlock {

    private Color color;

    public StickyPaperBlock(String name, Double price, int numPages, String size, Color color) {
        super(name, price, numPages, size);
        this.color = color;
    }
}
