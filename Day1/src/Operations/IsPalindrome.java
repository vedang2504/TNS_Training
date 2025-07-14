package Operations;

public class IsPalindrome {

	public static boolean ispalindrom( String str,int number) {
		int rev=0;int dummyNumber = number;
		while(number!=0) {
			rev=rev*10+number%10;
			number/=10;
		}
		return dummyNumber==rev;
		//check whether String is Palindrome or not.
	}
		
	public static void ispalindrom(int number,String str) {
		
	}

	
	public static void main(String[] args) {
		IsPalindrome ob=new IsPalindrome();
		System.out.println(ob.ispalindrom(787));
	}

}



