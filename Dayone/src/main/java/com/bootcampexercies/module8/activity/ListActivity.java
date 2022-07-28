package com.bootcampexercies.module8.activity;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ListActivity {
    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.

        ArrayList names=new ArrayList();
        names.add("Adam");
        names.add("jo");
        names.add("Alex");
        names.add("sara");
        //TODO: 2 - Call print method to print the list passed as its parameter.
        ListActivity obj = new ListActivity();
        obj.print(names);

    }

    void print(List list) {
        Iterator<Object> nameOfIterator = list.iterator();

        for (Object nameOfMyObject : list) {
            System.out.println(nameOfMyObject.toString());
        }
    }
}
