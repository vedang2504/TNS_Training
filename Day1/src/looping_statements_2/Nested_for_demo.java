package looping_statements_2;
import java.util.*;
public class Nested_for_demo {

	public static void main(String[] args) {
//		1.for finding the table of the single no using while loop.
		
//		int i=1;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the no.");
//		int no =sc.nextInt();
//		while(i<=10) {
//			System.out.println(no+" "+"X"+" "+ i +" "+"=" +" "+no*i);
//			i++;
//		}
		//2.Tables for creating the no from certain no to other.
		
//		int beg=10;
//		int end=20;
//		
//		for(int i=beg;i<=end;i++) {
//			for(int j =1;j<=10;j++) {
//				System.out.println(i + "*"+j+ "="+i*j);
//			}
//			System.out.println();
//		}
	    //once the condition executed. do while loop.
		//3.Program for the do while.
		
//		int k=10;
//		do {
//			System.out.println(k);
//			k++;
//		}
//		while(k<=10);
		
//		4.use of break and continue.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a no");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		
		

	}

}
