package opps.com;

import java.util.Scanner;

class Employee
{
	String empname,empdept;
	int empage;
	float empsalary;
	void empInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Name :");
		empname=sc.nextLine();
		System.out.println("Enter the Employee age :");
		empage=sc.nextInt();
		System.out.println("Enter the Employee Salary :");
		empsalary=sc.nextFloat();
		System.out.println("Enter the Employee Department :");
		sc.nextLine();
		empdept=sc.nextLine();
		sc.close();
	}
	void empAnnualSalary()
	{
		empsalary=empsalary*12;
	}
	void empDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Name :"+empname);
		System.out.println("Department :"+empdept);
		System.out.println("Age :"+empage);
		System.out.println("Annual Salary :"+empsalary);
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		Employee eob=new Employee();
		eob.empInput();
		eob.empAnnualSalary();
		eob.empDetails();
	}
}
