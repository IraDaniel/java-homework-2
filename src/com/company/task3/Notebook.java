package com.company.task3;

/**
 * Created by Ira on 15.12.2015.
 */
public class Notebook extends PaperBlock {

    private TypeLeaf typeLeaf; //  тип листов бумаги

    public Notebook(String name, Double price, int numPages, String size, TypeLeaf typeLeaf) {
        super(name, price, numPages, size);
        this.typeLeaf = typeLeaf;
    }
}
