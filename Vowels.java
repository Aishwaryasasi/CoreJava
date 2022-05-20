package Mypacks;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character :");
		ch=sc.next().charAt(0);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+ " is a vowel");
		}
		else
		{
			System.out.println(ch+ " is not a vowel");
		}
        sc.close();
	}

}
