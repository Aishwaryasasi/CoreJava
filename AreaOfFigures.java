package Mypacks;
import java.util.Scanner;

public class AreaOfFigures {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Length : ");
    float length=sc.nextFloat();
    System.out.println("Enter the breadth : ");
    float breadth=sc.nextFloat();
    float arearec=length*breadth;
    System.out.println("Area of the rectangle of length = " +length+ " and breadth = " +breadth+ " is areaofreactangle = "+arearec+" sqrunits");
    System.out.println("Enter the side : ");
    float side=sc.nextFloat();
    float areasqr=side*side;
    System.out.println("Area of square is side* "+side+ " side " +side+" is areaofsquare = " +areasqr+" sqrunits");
    System.out.println("Enter the radius : ");
    float radius=sc.nextFloat();
    float areacir=3.14159f*radius*radius;
    System.out.println("Area of a circle 3.14159f*radius = "+radius+ " *radius " +radius+ " is areaofcircle = " +areacir+" sqrunits");
    System.out.println("Enter the height : ");
    float height=sc.nextFloat();
    float areatri=0.5f*breadth*height;
    System.out.println("Area of a Triangle is 0.5f*breadth = "+breadth+ " and height = "+height+" is areaoftriangle = " +areatri+" sqrunits");
    sc.close();
    }

}
