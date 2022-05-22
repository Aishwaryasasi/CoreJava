//Program to find prime number using while loop
package edu.bridge;
import java.util.Scanner;
public class PrimeNumberUsingWhile {

	public static void main(String[] args) {
		int num,count,i=1;
		count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		while(i<=num)
		{
			if(num%i==0)  //19%1=0 
			{
				count++;  //count=1
			}
			i++; // i=2
			}
		
			if(count==2)
			{
				System.out.println(num+" is a prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
        sc.close();
	}
}
