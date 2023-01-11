package week11_exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        
        // create ArrayList
        Collection <String> list = new ArrayList<>();
        
        // add element
        list.add("İstanbul");
        list.add("Ankara");
        list.add("Antalya");

        // create LinkedList
        Collection <String> list2 = new LinkedList<>();
        // add element
        list2.add("Mandalina");
        list2.add("Çilek");
        list2.add("Karpuz");

        Iterator iter = list.iterator(); // Obtaining ListIterator
        Iterator iter2 = list2.iterator(); // Obtaining ListIterator

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }
    }
}
