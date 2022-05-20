package Mypacks;
import java.util.Scanner;

public class TernaryOperator2Largest {

	public static void main(String[] args) {
		int a,b,lar;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		lar=(a>b)? a:b;
				{
			System.out.println("The largest of "+a+ " and " +b+ " is "+lar);
				}
				sc.close();
        
	}
}
