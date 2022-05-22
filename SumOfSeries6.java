/*Program to compute and display the sum of the following series
  S=(1+2)/(1*2)+(1+2+3)/(1*2*3)+(1+2+3+4)/(1*2*3*4).................(1+2+3+4+...+n)/(1*2*3*4*..*n)
 */
package edu.coms;
import java.util.Scanner;
public class SumOfSeries6 {

	public static void main(String[] args) {
		int num,sum=0,prod=1;
		double res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
			prod=prod*i;
			res=res+((float)sum/prod);
		}
		System.out.println("The sum of the series is : "+res);
        sc.close();
	}

}
