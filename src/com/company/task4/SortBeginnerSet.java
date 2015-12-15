package com.company.task4;

import com.company.task3.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ira on 15.12.2015.
 */
public class SortBeginnerSet {

    public static void main(String[] args){
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Pencil("c",43.,5));
        items.add(new PaperBlock("a",100.,100,"A4"));
        items.add(new Notebook("notebook", 49.5, 48,"A5",TypeLeaf.CELL));
        items.add(new Notebook("notebook", 49.5, 48,"A5",TypeLeaf.LINE));
        items.add(new StickyPaperBlock("StickyPaperBlock",50.5,100,"A8",Color.GREEN));
        items.add(new Marker("aa",38., Color.BLUE,0.3));




        System.out.println("Sorting by name");
        Collections.sort(items, Item.getNameComparator());

        for(int i = 0; i < items.size();i++){
            System.out.println(items.get(i).getName());
        }

        System.out.println("Sorting by price");
        Collections.sort(items, Item.getPriceComparator());
        for(int i = 0; i < items.size();i++){
            System.out.println(items.get(i).getName());
        }
        System.out.println("Sorting by price and name");
        Collections.sort(items, Item.getPriceAndNameComparator());
        for(int i = 0; i < items.size();i++){
            System.out.println(items.get(i).getName());
        }



    }

}
