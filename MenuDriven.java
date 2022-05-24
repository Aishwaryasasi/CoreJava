package array.com;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		int ar[];
		int n,sum=0,op,temp,pos=-1,mid=0,low,high,key;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("-----------Menu--------------");
		System.out.println("1. To find Minimum ");
		System.out.println("2. To find Maximum");
		System.out.println("3. To find Sum");
		System.out.println("4. To find Average");
		System.out.println("5. To sort the elements");
		System.out.println("6. Linear search");
		System.out.println("7. Binary search");
		System.out.println("Enter your option");
		op=sc.nextInt();
		switch(op)
		{
		case 1:
			int min=ar[0];
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]<min)
				{
					min=ar[i];
				}
			}
			System.out.println("The smallest element is "+min);
			break;
		case 2:
			int max=ar[0];
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]>max)
				{
					max=ar[i];
				}
			}
			System.out.println("The largest element is "+max);
			break;
		case 3:
			for(int i=0;i<ar.length;i++)
			{
				sum=sum+ar[i];
			}
			System.out.println("The sum of the elements is "+sum);
			break;
		case 4:
			for(int i=0;i<ar.length;i++)
			{
				sum=sum+ar[i];
			}
			avg=(float)sum/ar.length;
			System.out.println("The average is "+avg);
			break;
		case 5:
			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length-1-i;j++)
				{
					if(ar[j]>ar[j+1])
					{
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
			}
			System.out.println("The sorted array is :");
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]+ " ");
			}
			break;
		case 6:
			System.out.println("Enter the key element ");
			key=sc.nextInt();
			for(int i=0;i<ar.length;i++)
			{
				if(key==ar[i]) 
				{
					pos=i;
					break;
				}
			}
			if(pos>=0)
			{
				System.out.println("Successful search");
				System.out.println(key+" found at position "+(pos+1));
			}
			else
			{
				System.out.println("Unsuccessful search");
				System.out.println(key+" not found ");
			}
			break;
		case 7:
			System.out.println("Enter key element");
			  key=sc.nextInt();
			  for(int i=0;i<n;i++)
				{
					for(int j=0;j<n-1-i;j++)
					{
						if(ar[j]>ar[j+1])
						{
							temp=ar[j];
							ar[j]=ar[j+1];
							ar[j+1]=temp;
						}
					}
				}
			  low=0;
			  high=n-1;
			  while(low<=high) 
			  {
			   mid=(low+high)/2;
			   if(ar[mid]==key) 
			   {
			    pos=mid;
			    break;
			   }
			   
			   else if(key<ar[mid]) 
			   {
			    high=mid-1;
			   }
			   else 
			   {
			    low=mid+1;
			   }
			   
			  }
			  
			  if(pos>=0) {
			   System.out.println("Successful search");
			   System.out.println(key +" found at position "+(mid+1));
			  }
			  else {
			   System.out.println("unsuccessgful search");
			   System.out.println(key+" not found");
			  }
			  break;
		default:
			System.out.println("Invalid option");
			break;
		}
		sc.close();
		
	}	
}
