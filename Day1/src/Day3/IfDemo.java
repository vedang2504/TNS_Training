package Day3;

import java.util.*;

//conditional statements.

public class IfDemo {

	public static void main(String[] args) {
		
		// 1.To check no is greater or not.
		int a=30;
		int b=20;

		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		
		else {
			System.out.println("b is not greater");
		}
		
		//2.either the no is even and odd.
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Its is even");
		}
		else {
			System.out.println("It is odd");
		}
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		if(age<65) {
			System.out.println("eligible for blood donation");
		}
		else {
			System.out.println("Not eligible for blood donation");
		}
		
		//3. Eligible for vote or not.4
		
		if(age>=18) {
			
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
		
		//4.code for the prime no.
		for(int i=1;i<=Math.sqrt(n);i++) {
			
			if(n%i==0) {
				count++;
				if((n/i)!=i){
					count++;
				}
			}
		}
		if (count==2){
			System.out.println("It is prime no");
		}
		else {
			System.out.println("It is not prime no");
		}
		System.out.println();
		
	
	}

}
