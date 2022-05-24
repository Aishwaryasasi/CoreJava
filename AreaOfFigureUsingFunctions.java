package opps.com;
import java.util.Scanner;
class Shapes{
	int length,breadth;
	float cirarea,sqrarea,triarea,side,radius,height;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length : ");
		length=sc.nextInt();
		System.out.println("Enter the breadth : ");
		breadth=sc.nextInt();
		System.out.println("Enter the radius :");
		radius =sc.nextFloat();
		System.out.println("Enter the sides :");
		side=sc.nextFloat();
		System.out.println("Enter the height ");
		height=sc.nextFloat();
		sc.close();
		}
	void calAreaCircle()
	{
		cirarea=3.14159f*radius*radius;
	}
	void calAreaTriangle()
	{
		triarea=0.5f*breadth*height;
	}
	void calAreaSquare()
	{
		sqrarea=side*side;
	}
	void disCircleArea()
	{
		System.out.println("The Area of a circle of radius= "+radius+" is "+cirarea);
	}
	void disTriangleArea()
	{
		System.out.println("The Area of a Triangle of breadth= "+breadth+" and height = "+height+ " is "+triarea);
	}
	void disSquareArea()
	{
		System.out.println("The Area of a square of sides= "+side+" is "+sqrarea);
	}
}
public class AreaOfFigureUsingFunctions {

			public static void main(String[] args) 
			{
				Shapes ob= new Shapes();
				ob.input();
				ob.calAreaCircle();
				ob.calAreaTriangle();
				ob.calAreaSquare();
				ob.disCircleArea();
				ob.disTriangleArea();
				ob.disSquareArea();
			}
			
}

