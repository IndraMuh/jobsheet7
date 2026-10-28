import java.util.Scanner;

public class TotalTicket10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketPrice = 50000, totalTicketsSales = 0, totalTicketsPurchased = 0, totalPrice, ticketAmount, discount, customerCount = 0;

        do {
            System.out.print("Enter the number of tickets to purchase (type 0 to exit): ");
            ticketAmount = sc.nextInt();
            if (ticketAmount == 0) {
                System.out.println("");
                System.out.println("================================");
                System.out.println("Transaction Summary");
                System.out.println("================================");
                System.out.println("Transaction cancelled.");
                System.out.println("Total tickets purchased: " + totalTicketsPurchased);
                System.out.println("Total sales: Rp " + totalTicketsSales);
                System.out.println("Number of customers served: " + customerCount);
                break;
            }
            if (ticketAmount < 0) {
                System.out.println("Invalid number of tickets.");
                continue;
            }
            
            customerCount++;
            if(ticketAmount > 10) {
                discount = 15; 
            } else if(ticketAmount > 4) {
                discount = 10; 
            } else {
                discount = 0; 
            }

            totalPrice = ticketAmount * ticketPrice;
            totalPrice -= (totalPrice * discount / 100);
            totalTicketsPurchased += ticketAmount;
            totalTicketsSales += totalPrice;
            System.out.println("Discount applied: " + discount + "%");
            System.out.println("Total price for " + ticketAmount + " tickets: Rp " + totalPrice);
        } while (true);
        sc.close();
    }
}