package com.edu;

import java.util.Scanner;

public class LargestOf2Numbers {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the first number");
	    num1=sc.nextInt();
	    System.out.println("Enter the second number");
	    num2=sc.nextInt();
	    if(num1>num2)
	    {
	    	System.out.println("The largest number is "+num1);
	    }
	    else
	    {
	    	System.out.println("The largest number is "+num2);
	    }
	    sc.close();
	}

}
