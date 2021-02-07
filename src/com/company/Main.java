package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //HASHSET
        Set<String> names = new HashSet<String>();
        names.add("Jake");
        names.add("Robert");
        names.add("Marisa");
        names.add("Kasey");
        System.out.println(names);

        //TREESET
        Set<String> fruits = new TreeSet<String>();
        fruits.add("Strawberry");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits);

        //LINKEDHASHSET
        Set<String> food = new LinkedHashSet<String>();
        food.add("lasagne");
        food.add("Pizza");
        food.add("Burger");
        food.add("Suppe");
        System.out.println(food);


        Set<Integer> tal = new HashSet<Integer>();
        tal.add(74);
        tal.add(12);
        tal.add(74);
        tal.add(74);
        tal.add(43);
        tal.remove(74);
        tal.remove(999);
        tal.remove(43);
        tal.add(32);
        tal.add(12);
        tal.add(9);
        tal.add(999);
        System.out.println(tal) ;

        Map<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("khadija", 20);
        ages.put("lulu", 10);
        ages.put("shahad",5 );
        ages.put("Aliyah", 4);
        ages.put("zalal", 32);
        System.out.println(ages) ;

        Set<String> bob = new HashSet<String>();
        bob.add("Jake");
        bob.add("Robert");
        bob.add("Kasey");
        bob.add("Kasey");
        bob.add("Marisa");
        bob.add("Marisa");
        bob.add("Kasey");
        System.out.println(bob);

        Set<String> k = new TreeSet<String>();
        k.add("Jake");
        k.add("Robert");
        k.add("Kasey");
        k.add("Kasey");
        k.add("Marisa");
        k.add("Marisa");
        k.add("Kasey");
        System.out.println(k);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(27);
        list.add(7);
        list.add(11);
        list.add(-5);
        list.add(32);
        list.add(9);
        list.add(9);
        System.out.println(list);


    }


    public int sortAndRemoveDuplicates(){
        return
    }



    }


