package com.edu;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int mark;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the mark : ");
		mark=scan.nextInt();
		if(mark>=90 && mark<=100)
		{
			System.out.println("Grade A");
		}
		else if(mark>=60 && mark<=89)
		{
			System.out.println("Grade B");
		}
		
		else if (mark>=40 && mark<=59)
		{
			System.out.println("Grade C");
		}
		else if(mark>=0 && mark<=39)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("invalid");
		}
		scan.close();
	}

}
