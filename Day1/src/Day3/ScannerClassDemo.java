package Day3;

import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//1.for String.
		
		System.out.println("Enter the Email Id");
		String line =sc.nextLine();
		System.out.println(line);
		//2.for int value.
		System.out.println("enter the no");
		int val = sc.nextInt();
		System.out.println(val);
	}

}
