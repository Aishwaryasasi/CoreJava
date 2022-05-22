/*Program to find the sum of the given series
  S=1!+2!+3!+........+n!
 */
package edu.coms;
import java.util.Scanner;
public class SeriesExample7 {

	public static void main(String[] args) {
		int num,fact=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println("The sum of the series is : "+sum);
		sc.close();
	}

}
