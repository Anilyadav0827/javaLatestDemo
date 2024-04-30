package mapDemo;

public class Ticket {
    public String ticketId;
    public String status;

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

   @Override
   public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(this.getClass()!=obj.getClass()){
            return false;

        }
        Ticket ticket=(Ticket) obj;
        return this.ticketId.equals(ticket.ticketId);

   }
   @Override
    public int hashCode(){
        return this.ticketId.hashCode()+this.status.hashCode();
   }
}
