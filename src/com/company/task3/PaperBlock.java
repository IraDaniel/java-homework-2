package com.company.task3;

/**
 * Created by Ira on 15.12.2015.
 */
public class PaperBlock extends Item{

    protected int numPages; // ���������� ������� � �����
    private String size;       //  ������ �����


    public PaperBlock(String name, Double price, int numPages, String size) {
        super(name, price);
        this.numPages = numPages;
        this.size = size;
    }
}
