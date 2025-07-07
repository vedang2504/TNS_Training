package Assignment;
import java.util.*;
//Constructor assignment.
//System.out.println("id"+" "+id+" "+"name"+" "+name+" "+"age"+" "+age);
public class Customer1 {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Customer1(Customer1 temp) {
		this.id = temp.getId();
		this.name = temp.getName();
		this.age=temp.getAge();
		System.out.println("id"+" "+id+" "+"name"+" "+name+" "+"age"+" "+age);
	}
	public Customer1() {}

	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Customer1 ob = new Customer1();
		System.out.println("Enter the id");
		ob.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the name");
		ob.setName(sc.nextLine());
		System.out.println("Enter the age");
		ob.setAge(sc.nextInt());
	}
}
