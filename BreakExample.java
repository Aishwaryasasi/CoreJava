package edu.bridge;

public class BreakExample {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				//break;//it will break the loop after 5
				continue; // it will skip only 5 and continue with other numbers
			else {
				System.out.println(i+" ");
			}
		}
		System.out.println("out side the for loop");
	}

}
