package week8_exercises;

import java.util.Date;

public class Document {
    private String[] authors = new String[10];
    private Date date;
    int i;

    public Document(String authors, Date date,int i){
        this.authors[i]=authors;
        this.date=date;
    }
    
    public String getAuthors(){
        return authors[i];
    }

    public void addAuthor(String name,int i){
        this.authors[i]=name;
    }

    public Date getDate(){
        return date;
    }
}

class Book extends Document{
    private String title;

    public Book(String authors, Date date,int i,String title){
        super(authors, date, i);
        this.title=title;
    }

    public String getTitle(){
        return title;
    }
}

class Email extends Document{
    private String subject;
    public String[] to = new String[10];

    public Email(String subject, String to, String authors, Date date,int i){
        super(authors, date, i);
        this.subject=subject;
        this.to[i]=to;
    }

    public String getSubject(){
        return subject;
    }

    public String getTo(){
        return to[i];
    } 
}

class TestMain{
    public static void main(String[] args) {
        Date simdikiZaman = new Date();
        
        Book b = new Book("Adam Fawer", simdikiZaman, 0, "Olasılıksız");
        b.addAuthor("Sabahattin Ali", 0);
        System.out.println(b.getAuthors());

        Email e = new Email("homework", "Kasım Özacar", "Dostoyevski", simdikiZaman, 0);
        e.addAuthor("Yasar Kemal", 0);
        System.out.println(e.getAuthors());
        System.out.println(e.getSubject());
        System.out.println(e.getTo());

    }
}
