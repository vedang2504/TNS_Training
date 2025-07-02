package Assignment;
import java.util.*;
public class Atm_system {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean i = true;
		int total_balance = 100; 
		
		while(i) {
			System.out.println("Enter the Choice");
			System.out.println("1.Check balance");
			System.out.println("2.Withdrw Money");
			System.out.println("3.Deposit Money");
			System.out.println("4.exit");
			
			
			int x=sc.nextInt();
			switch (x) {
			
			case 1:
				System.out.println("Available balance"+total_balance);
				break;
			case 2:
				System.out.println("Amount to withdraw");
				int withdraw = sc.nextInt();
				total_balance =total_balance - withdraw;
				break;
			case 3:
				System.out.println("Amount to be deposited");
				int deposit =sc.nextInt();
				total_balance = total_balance+deposit;
				break;
			case 4:
				i=false;
				System.out.println("Successfully exit");
			}
			
		}

	}

}
