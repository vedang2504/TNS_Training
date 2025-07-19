package Assignment;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Customer name");
		String name = sc.nextLine();
		System.out.println("Enter Event name");
		String ev_name = sc.nextLine();
		System.out.println("Enter no of tickets");
		int tickets =sc.nextInt();
		double amount=tickets*250; 
		
		TicketBooking booking = new TicketBooking(ev_name, name, tickets, amount);
		System.out.println("Choose payment method:\n1. Cash\n2. Wallet\n3. Credit Card");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			booking.makePayment(amount);
			break;
		case 2:
			sc.nextLine();
			System.out.println("Enter the walletname");
			String walletname = sc.nextLine(); 
			booking.makePayment(amount,walletname);
			break;
		case 3:
			sc.nextLine();
			System.out.println("Enter the card name:");
			String card=sc.nextLine();
			System.out.println("Enter the card holder name:");
			String holder=sc.nextLine();
			System.out.println("Enter the card expiry:");
			String expiry=sc.nextLine();
			booking.makePayment(card,holder,expiry,amount);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		
	}

}
