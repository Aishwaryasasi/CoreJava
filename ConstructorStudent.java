//Constructor without argument
package edu.cons;
class Student
{
	int sid;
	String name;
	float sfees;
	Student()
   {
		System.out.println("Constructors");
		sid=123;
		name="Aishu";
		sfees=7500.250f;
   }
	
}

public class ConstructorStudent {

	public static void main(String[] args) {
		Student ob=new Student();
		System.out.println("Student id :"+ob.sid);
		System.out.println("Student name :"+ob.name);
		System.out.println("Student fees :"+ob.sfees);
	}

}
