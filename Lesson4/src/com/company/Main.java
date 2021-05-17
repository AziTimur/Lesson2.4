package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> names = new ArrayList<>(6);

        names.add("Anna");
        names.add("Dima");
        names.add("Pavel");
        names.add("Tima");
        names.add(1, "Masha");

//        for (String item: names) {
//            System.out.println(item);
//        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections.sort(names);
        Collections.reverse(names);
        Collections.shuffle(names);
        iterator = names.iterator();
        System.out.println("Second iterator");
        System.out.println("_________");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tilek");
        names2.add("Adyl");
        names2.add("Adel");
        names2.add("Katya");

        printList(names2);

        names.addAll( names2);
        printList(names);

        System.out.println("Is there any Anna? - "+names.contains("Anna"));
        System.out.println("Is there any Anna? - "+names2.contains("Anna"));
        names.remove("Katya");
        names.remove(4);
        names.retainAll(names2);
        printList(names);
        System.out.println("Is the list empty? - "+names.isEmpty());
        names.clear();
        System.out.println("Is the list empty? - "+names.isEmpty());
    }

    public static void printList(ArrayList<?> list) {
        System.out.println("__________________");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(i + " - " +list.get(i));
        }
    }
}
