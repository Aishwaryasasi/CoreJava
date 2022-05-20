package com.edu;
import java.util.Scanner;
public class Grademarks {

	public static void main(String[] args) {
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grade :");
		grade=sc.next().charAt(0);
		if(grade=='A')
		{
			System.out.println("The mark range is between 90 to 100 ");
		}
		else if(grade=='B')
		{
			System.out.println("The mark range is between 70 to 89");
		}
		else if(grade =='C')
		{
			System.out.println("The mark range is between 40 to 69");
		}
		else if(grade=='D')
		{
			System.out.println("The mark range is betwwen 0 to 39");
		}
		else
		{
			System.out.println("Invalid grade entered");
		}
		sc.close();

	}

}
