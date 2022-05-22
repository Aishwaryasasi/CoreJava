package edu.coms;
import java.util.Scanner;
public class SeriesExample8 {

	public static void main(String[] args) {
		int num,x,fact=1;
		float sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values : ");
		x=sc.nextInt();
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			sum=sum+(float)((i*x)+i)/fact;
		}
		System.out.println("The sum of the series is : "+sum);
        sc.close();
	}

}
