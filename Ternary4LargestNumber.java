//Program to find largest of 4 numbers using Ternary operator
package Mypacks;
import java.util.Scanner;
public class Ternary4LargestNumber {

	public static void main(String[] args) {
		int num1,num2,num3,num4,lar;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 4 numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		lar=(num1>num2 && num1>num3 && num1>num4)?num1:(num2>num3 && num2>num4)?num2:(num3>num4)?num3:num4;
		System.out.println("The largest of "+num1+ " and "+num2+" and "+num3+" and "+num4+ " is "+lar);
		sc.close();
		
	}

}
