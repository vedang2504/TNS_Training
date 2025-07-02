package looping_statements_2;
import java.util.*;
public class Nested_for_demo {

	public static void main(String[] args) {
		//1.for finding the table of the single no using while loop.
		
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.");
		int no =sc.nextInt();
		while(i<=10) {
			System.out.println(no+" "+"X"+" "+ i +" "+"=" +" "+no*i);
			i++;
		}
		//2.Tables for creating the no from certain no to other.
	int end=20;
	int beg=10;
		
		for(int a=beg;a<=end;a++) {
			for(int j =1;j<=10;j++) {
				System.out.println(a + "*"+j+ "="+a*j);
			}
			System.out.println();
		}
	    //once the condition executed. do while loop.
		//3.Program for the do while.
		
		int k=10;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=10);
		
//		4.use of break and continue.
		System.out.println("Enter a no");
		int n= sc.nextInt();
		
		for(int j=1;j<=n;j++) {
			if(j%2!=0) {
				continue;
			}
			else {
				System.out.println(j);
			}
		}
		
		
		

	}

}
