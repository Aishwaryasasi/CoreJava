//Program to find largest of 5 numbers
package Mypacks;
import java.util.Scanner;

public class TernaryLargest5Numbers {

	public static void main(String[] args) {
		int num1,num2,num3,num4,num5,lar;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();
		lar=(num1>num2 && num1>num3 && num1>num4 && num1>num5)?num1:(num2>num3 && num2>num4 && num2>num5)?num2:(num3>num4 && num3>num5)?num3:(num4>num5)?num4:num5;
		System.out.println("The largest of 5 numbers is "+lar);
		sc.close();

	}

}
