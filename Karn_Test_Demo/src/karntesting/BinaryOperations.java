package karntesting;

import java.util.*;
public class BinaryOperations {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any two Numbers");
		
		int i = sc.nextInt();
		
		int k=sc.nextInt();
		int sum=i+k;
		int product=i*k;
		int difference=i-k;
		int average=(i+k)/2;
		int distance=difference;
		int max;
		int min;
		
		if (i>k)
		{
			max=i;
			min=k;
			System.out.println("maximum" +"  "+max);
			System.out.println("minimum" +"  "+min);
		}
		else
		{
			min=k;
			max=i;
		    System.out.println("minimum" +"  "+min);
		    System.out.println("maximum" +"  "+max);
		}
		System.out.println("sum" +"  "+sum);
		System.out.println("product" +"  "+product);
		System.out.println("difference" +"  "+difference);
		System.out.println("average" +"  "+average);
		System.out.println("distance" +"  "+distance);
	}


	}
		
	
			