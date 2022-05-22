package pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i+1;k++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(n++ + " ");
				
			}
			System.out.println("  ");
		}

	}

}
