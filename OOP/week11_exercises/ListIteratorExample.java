package week11_exercises;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>(); // Create a LinkedList

        linkedList.add("Zeynep"); // Add elements to LinkedList
        linkedList.add("Gülde");
        linkedList.add("Müge");

        ListIterator iter = linkedList.listIterator(); // Obtaining ListIterator
        
        System.out.println("Forward iteration:");
        // Iterating the list in forward direction
        while(iter.hasNext())
            System.out.println(iter.next());
        
        System.out.println("\nBackward iteration:");
        // Iterating the list in backward direction
        while(iter.hasPrevious())
            System.out.println(iter.previous());
    }
}
