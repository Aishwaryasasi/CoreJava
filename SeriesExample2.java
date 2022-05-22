package edu.coms;
import java.util.Scanner;
public class SeriesExample2 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term : ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i*i+" ");
		}
        sc.close();
	}

}
