/*1.calculateSal
Read the question carefully and follow the input and output format.

Karen got salary for this month and she spends 20% of her salary for food and 30% of her salary for travel. If she takes care of other shifts she will get 2% of the salary per day. Given her salary and the number of shifts she handled. Calculate how much she can save in her pocket after spending all these?

Input and Output Format :
First line of input consists of an integer, salary. Next line correspond to the number of shifts. Output consist of an integer, which is saving.

1) Print "Salary too large" when salary is greater than 8000.
2) Print "Shifts too small" when the shift is less than 0.
3) Print "Salary too small" when the salary is less than 0.

Sample Input 1:
7000
5
Sample Output 1:
4200

Sample Input 2:
80000
Sample Output 2:
Salary too large
Sample Input 2:
6000
-1
Sample Output 2:
Shift too small
 */
package com.edu;
import java.util.Scanner;
public class SalaryCalculation {
	public static void main(String[] args) {
		int salary=0,shift=0, savings=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary :");
		salary=sc.nextInt();
		System.out.println("Enter no. of shifts :");
		shift=sc.nextInt();
		if(salary>8000)
		{
			System.out.println("Salary too large");
		}
		
		else if(shift<0)
		{
			System.out.println("Shifts too small");
		}
		else if(salary<0)
		{
			System.out.println("Salary too small");
		}
		else
		{
			savings=((salary/100)*(20+30))+(((salary*shift)/100)*2);
			System.out.println("The savings amount is "+savings);
		}
		
		sc.close();

	}

}
