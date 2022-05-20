package com.edu;
import java.util.Scanner;
public class FahrenheatToCelsius {

	public static void main(String[] args) {
		double fahrenheat,celsius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		fahrenheat=sc.nextDouble();
		celsius=((fahrenheat-32)*0.55556);
		System.out.println(fahrenheat+ " degree Fahrenheat is equal to "+celsius+ " in celsius");
		sc.close();
	}
}
