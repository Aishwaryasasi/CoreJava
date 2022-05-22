package array.com;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		String text;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text :");
		text=sc.nextLine();
		char arr[]=text.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		sc.close();

	}

}
