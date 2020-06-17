package com.company.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    /*
        ElementOne is base class for ElementTwo. ElementTwo overrides hashcode and equals methods from ElementOne which it
        inherits from Object class.
    */

    public static void main(String[] args) {
        Map<ElementOne,String> mapOne = new HashMap<>();

        ElementOne a = new ElementOne(1,"a");       //Instance of Element one will call equals and hashcode method from object class
        ElementOne b = new ElementOne(1,"a");
        ElementOne c = new ElementTwo(1,"a");       //Instance of Element two will call overridden equals and hashcode methods
        ElementOne d = new ElementTwo(1,"a");


        mapOne.put(a,a.getMessage()); //ElementOne, new reference
        mapOne.put(a,a.getMessage()); // ElementOne, already added reference
        mapOne.put(b,b.getMessage()); //Element one, new reference
        mapOne.put(c,c.getMessage()); //ElementTwo, new reference
        mapOne.put(d,d.getMessage()); //ElementTwo, new reference


        System.out.println(mapOne);


        /* Output - {id :1 message: a=a, id :1 message: a=a, id :1 message: a=a}
         * Both the objects a and b are stored as individual keys even though they have the same contents whereas ElementTwo objects c
          * and d are stored as one key as they are equal. */
    }
}
