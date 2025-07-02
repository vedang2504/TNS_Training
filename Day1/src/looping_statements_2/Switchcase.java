package looping_statements_2;

public class Switchcase {

	public static void main(String[] args) {
		 char x ='a';
		 switch(x) {
		 case 'l':
			 System.out.println("This code contains letter");
			 break;
		 case 'i':
			 System.out.println("This code contains integer");
		 case 's':
			 System.out.println("This code contains symbols");
		 case'w':
			 System.out.println("This code contains White_spaces");
			 break;
		 default:
			 System.out.println("This code contains no one known cases");
			 break;
		 }
	}
}
