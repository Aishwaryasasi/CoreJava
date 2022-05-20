package com.edu;
import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		num1=sc.nextInt();
		System.out.println("Enter the second number :");
		num2=sc.nextInt();
		System.out.println("Enter the Third number :");
		num3=sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("The largest number is num1 "+num1);
		}
		else if(num2>num3)
		{
			System.out.println("The largest number is num2 "+num2);
		}
		else
		{
			System.out.println("The largest number is num3 "+num3);
		}
		

	}

}
