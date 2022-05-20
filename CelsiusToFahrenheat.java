// Program to convert Clsius to fahrenheat
package com.edu;
import java.util.Scanner;

public class CelsiusToFahrenheat {

	public static void main(String[] args) {
		double fahrenheat,celsius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		celsius=sc.nextDouble();
		fahrenheat=((1.8*celsius)+32);
		System.out.println(celsius+ " degree Celsius is equal to "+fahrenheat+ " in Fahrenheat");
		sc.close();
	}

}
