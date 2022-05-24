package opps.com;

import java.util.Scanner;

class Discount
{
	int cost;
	String name;
	double dis_amount;
	double amount;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost :");
		cost=sc.nextInt();
		System.out.println("Enter the name :");
		sc.nextLine();
		name=sc.nextLine();
		sc.close();
	}
	void cal()
	{
		if(cost<=5000)
		{
			System.out.println("No Discount");
		}
		else if(cost>=5001 && cost<=10000)
		{
			dis_amount=0.10*(cost-5000);
		}
		else if(cost>=10001 && cost<=15000)
		{
			dis_amount=0.15*(cost-10000);
		}
		else
		{
			dis_amount=0.20*(amount-15000);
		}
		amount=cost-dis_amount;
	}
	void display()
	{
		System.out.println("Cost\t  Name \t    Amount \t Discount ");
		System.out.println(cost+ " \t     " +name+" \t      "+amount+" \t    "+dis_amount);
	}
	
}
public class CustomerDiscountDeatils {

	public static void main(String[] args) {
		Discount dob=new Discount();
		dob.input();
		dob.cal();
		dob.display();
		

	}

}
