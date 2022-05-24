package array.com;
import java.util.Scanner;
class Employee{
	String empname;
	int empage;
	float empsalary;
	String empdept;  
	float annualsal;   
	void empInput()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter name");
	    empname=sc.nextLine();
	    System.out.println("Enter age");
	    empage=sc.nextInt();
	    System.out.println("Enter salary");
	    empsalary=sc.nextFloat(); 
	    System.out.println("Enter employee Department");
	    sc.nextLine();
	    empdept=sc.nextLine();
	   }

	void empAnnualSalary()
	{
		annualsal=empsalary*12;
	}

	void empDetails()
	{
		System.out.println("Employee Details");
	    System.out.println("Name="+empname);
	    System.out.println("Annual salary="+annualsal);
	    System.out.println("Age="+empage);
	    System.out.println("Department="+empdept);
	}
	}

public class EmployeeDetailsUsingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Employee :");
		int n=sc.nextInt();
		Employee eob[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			eob[i]=new Employee(); 
		}
		//input the employees data
		for(int i=0;i<n;i++)
		{
			eob[i].empInput();
		}
		//salary calculation
		for(int i=0;i<n;i++)
		{
			eob[i].empAnnualSalary();
		}
		//employee details
		for(int i=0;i<n;i++)
		{
			eob[i].empDetails();
		}
		sc.close();
	}

}
