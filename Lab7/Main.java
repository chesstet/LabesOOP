package Lab7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import Lab6.Automobile;

public class Main {
    public static void main(String[] args) {
        Leest myList = new Leest(new Automobile(0, 0, 0));
        myList.add(new Automobile(10100, 10, 100));
        myList.add(new Automobile(10200, 11, 120));

        Leest emptyList = new Leest();
        emptyList.add(new Automobile(10700, 6, 130));

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Automobile(10400, 9, 140));
        arrayList.add(new Automobile(10500, 8, 125));
        Leest myList2 = new Leest(arrayList);


        System.out.println(myList2.contains(new Automobile(10400, 9, 140)));

        myList2.clear();

        ListIterator listIterator = myList2.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

        System.out.println("bruh");
    }
}