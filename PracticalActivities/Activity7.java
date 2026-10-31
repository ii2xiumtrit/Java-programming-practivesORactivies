package PracticalActivities;

public class Activity7 {
    public static void main(String[] args) {
        boolean hasTicket = false;
        boolean isVIP = true;

        System.out.println("Has Ticket: "+hasTicket);
        System.out.println("is VIP: "+ isVIP);
        System.out.println("can enter: "+(hasTicket == true || isVIP == true));
    }
}
