//Program to find prime number
package edu.bridge;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int num,count;
		count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}}
		
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
