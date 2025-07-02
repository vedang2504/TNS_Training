
// Methods in java and about Object creation and some info about constructor.

package Day3;

public class MethodsDemo {
	
	public void Addition() {
		int x=20;
		int y=10;
		int add=x+y;
		System.out.println("Addition of x and y is"+add);
	}
	public void Multiply(int a,int b) {
		int mul=a*b;
		System.out.println("Multiplication of a and b "+mul);
	}
	public void Swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a and b "+a+""+b);
	}


	public static void main(String[] args) {
		MethodsDemo ob =new MethodsDemo();
		ob.Addition();
		ob.Multiply(7,4);
		ob.Swap(2, 6);
	}
	
	

}
