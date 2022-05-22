/*Menu driven Program to find and display the sum of the series
    1) S=x^1-x^2+x^3-x^4+x^5.......-x^20; where x=2
    2) 1, 11, 111, 1111, 11111
 */
package edu.coms;
import java.util.Scanner;
public class SeriesUsingSwitch1 {
	public static void main(String[] args) {
		int num=1;
		float sum=0;
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------Menu--------------");
		System.out.println("1. To find and display the sum");
		System.out.println("2. To display the series");
		System.out.println("Enter your option : ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			for(int i=1;i<=20;i++) 
			{
				num=(int)Math.pow(2, i);
			    if(i%2==0)
			    {
			    	sum=sum-num;
			    }
			    else
			    {
			    	sum=sum+num;
			    }
				
			}
			System.out.println("The Sum of the series is = "+sum);
			break;
		case 2:
			System.out.println("The series is : ");
			for(int i=1;i<=5;i++)
			{
				System.out.print(num+" ");
				num=num*10+1;
			}
			break;
			default:
				System.out.println("Invalid option");
			    break;
		}
       sc.close();
	}

}
