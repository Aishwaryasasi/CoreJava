package array.com;

import java.util.Scanner;

class Employees
{
	int pan;
	String name;
	double taxincome,annualincome;
	double tax;
	Scanner sc= new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the PAN ID");
		pan=sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter the tax Income");
		taxincome=sc.nextDouble();
	}
	void cal()
	{
		if(taxincome<=250000)
		{
			System.out.println("No tax");
		}
		else if(taxincome>=250001 && taxincome<=500000)
		{
			tax=0.10*(taxincome-250000);
		}
		else if(taxincome>=500001 && taxincome<=1000000)
		{
			tax=(0.20*(taxincome-500000))+30000;
		}
		else
		{
			tax=(0.30*(taxincome-1000000))+50000;
		}
	}
	void display()
	{
		System.out.println("Pan Number\t  Name \t Tax Income \t Tax ");
		System.out.println(pan+ " \t     " +name+" \t      "+taxincome+" \t    "+tax);
	}
}

public class EmployeeDetails2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number of employee");
		 int n=sc.nextInt();
		 Employees eob1[] = new Employees[n];//array of objects
		 for(int i=0;i<n;i++) {
		 eob1[i]=new Employees(); //
		  }
		  //input employee data
		  for(int i=0;i<n;i++) {
		   eob1[i].input();
		  }
		  //Tax calculation
		  for(int i=0;i<n;i++) {
		   eob1[i].cal();
		  }
		  
		  for(int i=0;i<n;i++) {
		   eob1[i].display();
		   }
		  sc.close();

		}

	}

