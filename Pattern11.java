/*
         1
       2 5
     3 6 8
  4  7 9 10
  
 */
package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int num=i;
			for(int k=1;k<=4-i+1;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) 
			{
				System.out.print(num);
				num=num+i-j;
			}
			System.out.println(" ");
		}

	}

}
