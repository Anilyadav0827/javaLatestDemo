package streamsDemo;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class TicketService {
    //we can pass function interface as a parameters to method input
    public void ticketStatus(List<Ticket>ticketList, Predicate<Ticket>predicate){
        Iterator<Ticket>ticketIterator=ticketList.iterator();
        for(;ticketIterator.hasNext() ;){
            Ticket ticket= ticketIterator.next();
            if(predicate.test(ticket)){
                System.out.println("ticket status "+ticket.getStatus()+"ticket Id"+ticket.getTicketId());

            }
        }

    }
}
