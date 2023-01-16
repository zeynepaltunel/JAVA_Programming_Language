package week12_exercises;

import java.util.*;
import java.util.List;

public abstract class Ticket {
    public int number;
    int seatNumber;

    public Ticket(int number, int seatNumber){
        this.number=number;
        this.seatNumber=seatNumber;
    }

    public abstract void print();
    public abstract double computePrice();
}

class StandardTicket extends Ticket{
    
    double price;

    public StandardTicket(int number, int seatNumber){
        super(number, seatNumber);
        this.price=10;
    }

    @Override
    public void print(){
        System.out.println("Number: "+ number + " SeatNumber: " + seatNumber + " Price: " + price);
    }

    @Override
    public double computePrice(){
        return price;
    }
}

class DiscountTicket extends StandardTicket{
    
    double discount;

    public DiscountTicket(int number, int seatNumber,double discount){
        super(number, seatNumber);
        this.discount=discount;
    }

    @Override
    public void print(){
        System.out.println("Number: "+ number + " SeatNumber: " + seatNumber + " Price: " + price);
    }

    @Override
    public double computePrice(){
        return super.computePrice() - price*discount;
    }
}

class TicketSeller{
    List<Ticket> tickets;
    private double incomes;

    public TicketSeller(List<Ticket> tickets){
        this.tickets=tickets;
    }

    public void Sell(Ticket ticket){
        incomes += ticket.computePrice();
    }
    public double getIncomes(){
        return incomes;
    }
}
class SeatNumberComparator implements Comparator<Ticket>{
    @Override
    public int compare(Ticket t1, Ticket t2){
        return t1.seatNumber - t2.seatNumber;
    }
}


class TicketApp{
    public static void main(String[] args) {
        Ticket t1 = new StandardTicket(10, 1);
        Ticket t2 = new DiscountTicket(22, 2, 0.1);
        Ticket t3 = new DiscountTicket(12, 3, 0.2);
        Ticket t4 = new StandardTicket(35, 4);
        
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);

        //SortAndPrint(tickets);         

        TicketSeller ts = new TicketSeller(tickets);
        ts.Sell(t1);
        ts.Sell(t2);
        ts.Sell(t3);
        ts.Sell(t4);

        System.out.println(ts.getIncomes());

    /*  
    
    void SortAndPrint(List<Ticket> tickets){
            
        SeatNumberComparator seatComp = new SeatNumberComparator();
        Collection.sort(tickets,seatComp);
            
        for (Ticket ticket : tickets) {
            tickets.print();
        }  
    }
    
    */
    }
}
