/*Program to find the sum of given series
   S=a+a^2/2+a^3/3+a^4/4.......+a10/10
*/
package edu.coms;
import java.util.Scanner;
public class SeriesExample4 {

	public static void main(String[] args) {
		int a,num=10;
		float sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		a=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum+(float)a*i/i;
		}
		System.out.print("The sum of the series is "+sum);
		sc.close();

	}

}
