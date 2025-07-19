package Assignment;

public class TicketBooking {
	private String event_name;
	private String customer_name;
	private int ticket_count;
	private double total_Amount;
	
	TicketBooking(String event_name,String customer_name,int ticket_count,double total_ticket){
		this.event_name = event_name;
		this.customer_name = customer_name;
		this.ticket_count = ticket_count;
		this.total_Amount=total_ticket;
	}
	//Payment via Cash
	public void makePayment(double amount) {
		System.out.println("Payment Mode:Cash");
		printreceipt(amount);
	}
	//Payement via wallet
	public void makePayment(double amount,String walletname) {
		System.out.println("Used wallet name is"+walletname);
		printreceipt(amount);
	}
	public void makePayment(String cardno,String name,String expiry,double amount) {
		System.out.println("Payment method: Credit card");
		System.out.println("CardHolder's name:"+name);
		System.out.println("Card Number (Last 4 digits): ****" + cardno.substring(cardno.length() - 4));
		printreceipt(amount);
	}
	public void printreceipt(double amount) {
		System.out.println("------Receipt------");
		System.out.println("1."+"Event_name"+event_name);
		System.out.println("2."+"Customer_name"+customer_name);
		System.out.println("3."+"Total_ticket"+ticket_count);
		System.out.println("4."+"Total_amount"+total_Amount);
	}
	
	
	
	

	
	
	
	
}
