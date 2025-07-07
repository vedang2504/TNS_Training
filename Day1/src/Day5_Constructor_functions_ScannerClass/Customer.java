package Day5_Constructor_functions_ScannerClass;
import java.util.*;
public class Customer {
	public Customer() {
		System.out.println("Default constructor");
	}
	public Customer(int id,String name,int age) {
		System.out.println("Parameterized constructor");
		System.out.println("id"+" "+id+" "+"name"+" "+name+" "+"age"+" "+age);
	}

	public static void main(String[] args) {
		Customer ob1 = new Customer();
		Customer ob2 = new Customer(246,"Suresh",22);
	}

}
