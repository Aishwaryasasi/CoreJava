/*Program to check whether the number is positive or negative
 * 
 */

package com.edu;
import java.util.Scanner;
public class PositiveNegativeCheck {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		if(num>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
        sc.close();
	}

}
