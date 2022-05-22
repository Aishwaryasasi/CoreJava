//Program to find the sum and average of a given array
package array.com;
import java.util.Scanner;
public class SumOfArrayElements {

	public static void main(String[] args) {
		int ar[]=new int[5];
		int sum=0;
		float avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		for(int i=0;i<5;i++) 
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("The sum of array :");
		for(int i=0;i<5;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println(sum);
		avg=(float)sum/5;
		System.out.println("average :"+avg);
        sc.close();
	}

}
