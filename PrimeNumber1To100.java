//Program to find the number is prime factor from 1 to 100
package edu.bridge;
public class PrimeNumber1To100 {

	public static void main(String[] args) {
		int count=0;
		for (int i=1;i<=100;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
			if(i%j==0)
			{
				count++;
			}
		}
			if(count==2)
			{
			System.out.println(i);
			}
		}
		
	}

}
