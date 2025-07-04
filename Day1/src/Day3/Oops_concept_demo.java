package Day3;

public class Oops_concept_demo {
	private int serialNum; //Instance variable
	private String name;
	private int Age;
	
	//Getter and Setter.
	public void setSerialNum(int serialNum) {   //local variable created as a parameter.
		this.serialNum=serialNum;              //this is used to differentiate the instance variable and the local variable.
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setAge(int Age) {   //local variable created as a parameter.
		this.Age=Age;              //this is used to differentiate the instance variable and the local variable.
	}
	public int getAge() {
		return Age;
	}
	public void setname(String name) {   //local variable created as a parameter.
		this.name=name;              //this is used to differentiate the instance variable and the local variable.
	}
	public String getname() {
		return name;
	}
	@Override
	public String toString() {
		return "OopsconceptDemo[SerialNum ="+serialNum +",name = "+name+",Age="+Age+"]";
	}



	public static void main(String[] args) {
		Oops_concept_demo ob=new Oops_concept_demo();
		ob.setSerialNum(4);
//		System.out.println(ob.getSerialNum());
		ob.setname("Vedang");
//		System.out.println(ob.getname());
		ob.setAge(21);
//		System.out.println(ob.getAge());
		System.out.println(ob);
//		
		//toString() method is called automatically if the object of same class is called inside the print statement.
	}

}
