package com.edu;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		if((num%2)==0) {
			System.out.println("The number is even "+num);
		}
		else {
			System.out.println("The number is odd "+num);
		}
		sc.close();
	}

}
