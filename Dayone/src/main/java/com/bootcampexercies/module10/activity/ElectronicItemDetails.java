package com.bootcampexercies.module10.activity;

import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {
    static public double returnPriceOfItem(HashMap itemHashMap, String name) {
        double price = (double) itemHashMap.get(name);
        return price;
    }

    public static void main(String[] args) {

        HashMap<String, Double> itemHashMap = new HashMap<String, Double>();

        itemHashMap.put("TV", 100.5);
        itemHashMap.put("Refrigerator", 421.8);
        itemHashMap.put("Washing Machine", 317.6);
        itemHashMap.put("Laptop", 215.9);

        System.out.println("Price of TV is " + returnPriceOfItem(itemHashMap, "TV"));
    }
}
