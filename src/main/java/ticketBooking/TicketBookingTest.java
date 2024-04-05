package ticketBooking;

import java.util.Date;

public class TicketBookingTest {
    public static void main(String[] args) {
        Thread.currentThread().setName("Anil");
        System.out.println(Thread.currentThread().getName());
        Ticket ticket= new Ticket();// to store the state and behaviour--> why we need object.
        ticket.movieName="DJ Tillu";
        ticket.rowNO="A";
        ticket.seatNumber="2";
        ticket.showTime=new Date();

        Ticket ticket1= new Ticket();
        ticket1.movieName="DJ Tillu";
        ticket1.rowNO="A";
        ticket1.seatNumber="3";
        ticket1.showTime=new Date();
        Ticket ticket2= new Ticket();
        ticket2.movieName="DJ Tillu";
        ticket2.rowNO="A";
        ticket2.seatNumber="4";
        ticket2.showTime=new Date();

        Ticket ticket3= new Ticket();
        Ticket ticket4= new Ticket();
        Ticket ticket5= new Ticket();

    }
}
