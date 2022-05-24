//Constructor with no aurgument and with aurgument
package edu.cons;
class Student1
{
	int sid;
	String name;
	float sfees;
	Student1()  //Constructor with no aurgument
   {
		System.out.println("Constructors");
		sid=123;
		name="Aishu";
		sfees=7500.250f;
   }
	Student1(int sid,String name,float sfees)   //constructor with aurgument
	{
		this.sid=sid;   //this is an implicit object
		this.name=name;
		this.sfees=sfees;
	}
	
}

public class ConstructorWithArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 ob1=new Student1();
		Student1 ob2=new Student1(456,"Akshara",6500.340f);
		System.out.println("Student id :"+ob1.sid);
		System.out.println("Student name :"+ob1.name);
		System.out.println("Student fees :"+ob1.sfees);
		System.out.println("Student id :"+ob2.sid);
		System.out.println("Student name :"+ob2.name);
		System.out.println("Student fees :"+ob2.sfees);

	}

}
