package array.com;
import java.util.Scanner;
public class MaxAndMin {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered Elements are :");
		for(int i=0;i<5;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println(" ");
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("The largest of array elements is :"+max);
       int min=ar[0];
       for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min) 
			{
				min=ar[i];
			}
		}
		System.out.println("The smallest of array elements is :"+min);
		sc.close();
	}

}
