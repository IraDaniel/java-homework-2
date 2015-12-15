package com.company.task2;

import com.company.task1.Pen;

/**
 * Created by Ira on 15.12.2015.
 */
public class Worker {

    private Pen[] pens;
    private Notebook []notebooks;
    private int maxElements;
    private int indPens = 0;
    private int indNotebooks = 0;


    public Worker(int maxElements) {
        this.maxElements = maxElements;
        pens = new Pen[this.maxElements];
        notebooks = new Notebook[this.maxElements];
    }

    public boolean addPen(Pen newPen ){
        if(indPens > maxElements){
            return false;
        }else{
            pens[indPens] = new Pen(newPen.getColor(),newPen.getPrice()); // цвет, ширина, цена
            indPens++;
            return true;
        }

    }
    public boolean addNotebook(Notebook newNotebook){
        if(indNotebooks > maxElements){
            return false;
        }else{
            notebooks[indNotebooks] = new Notebook(newNotebook.getSize(), newNotebook.getPrice()); // цвет, ширина, цена
            indNotebooks++;
            return true;
        }

    }

    public double calcSumPrice(){
        double pricePen = 0.0;
        double priceNotebook = 0.0;
        int tmpMax = max();


        for(int i = 0; i < indPens; i++){
            pricePen += pens[i].getPrice();
        }
        for(int i = 0; i < indNotebooks; i++){
            priceNotebook += notebooks[i].getPrice();
        }
        return pricePen + priceNotebook;
    }


    public void showAllProducts(){
        System.out.println("All Products: ");
        for(int i = 0; i < indPens; i++){
            System.out.println(this.pens[i].getColor() + " "+  this.pens[i].getPrice());
        }
        for(int i = 0; i < indNotebooks; i++){
            System.out.println(this.notebooks[i].getSize() + " "+  this.notebooks[i].getPrice());
        }
    }


    private int  max(){
        if(indPens > indNotebooks){
            return indPens;
        }
        return indNotebooks;
    }
}
