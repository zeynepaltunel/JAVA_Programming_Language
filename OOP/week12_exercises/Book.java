package week12_exercises;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;

public class Book implements Comparable<Book> {
    String name;
    double price;

    public Book(String name, double price){
        this.name=name;
        this.price=price;
    }

    public double totalPrice(){
        return price + price*0.08f;
    }
    @Override
    public int compareTo(Book b){
        return (int)(this.totalPrice() - b.totalPrice());
    }
    @Override
    public String toString() {
        return "Name: "+name+", Price: "+price;
    }
}

class Test{
    public static void main(String[] args) {
        Book b1 = new Book("a", 600);
        Book b2 = new Book("b", 200);
        Book b3 = new Book("c", 1000);
        Book b4 = new Book("d", 400);

        LinkedList<Book> books = new LinkedList();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Collections.sort(books);

        ListIterator iter = books.listIterator();

        while(iter.hasNext())
            System.out.println(iter.next());
    }
}