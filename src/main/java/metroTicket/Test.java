package metroTicket;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Address entryAddress= new Address();
        Address exitAddress= new Address();
         Ticket ticket= new Ticket();
         Entry entry= new Entry();
         Exit exit= new Exit();
        entryAddress.metroStationName="jntuh";
        entryAddress.platformNo="p2";
        exitAddress.platformNo="p2";
        exitAddress.metroStationName="lb nagar";

        entry.address=entryAddress;
        exit.address=exitAddress;

        ticket.exit=exit;
        ticket.entry=entry;

        ticket.ticketId="TA123456";
        ticket.price=50;
        ticket.dateOfJourney=new Date();

        System.out.println("Entry MetroStation: "+ticket.entry.address.metroStationName);
        System.out.println("Entry Platform: "+ticket.entry.address.platformNo);
        System.out.println("Exit MetroStation: "+ticket.exit.address.metroStationName);
        System.out.println("Exit platform: "+ticket.exit.address.platformNo);
        System.out.println("Ticket Id number: "+ticket.ticketId);
        System.out.println("Date of journey: "+ticket.dateOfJourney);
        System.out.println("Ticket price: "+ticket.price);

    }
}
