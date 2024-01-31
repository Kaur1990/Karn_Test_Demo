package karntesting;

import java.util.*;

public class GreaterValueoutof3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st value");
		int i=sc.nextInt();
		System.out.println("Enter 2nd value");
		int j=sc.nextInt();
		System.out.println("Enter 3rd value");
		int k=sc.nextInt();
		
		if ((i>j)&(i>k))
		System.out.println(i);
		else if (j>k)
		System.out.println(j);
		else
			System.out.println(k);
		
		
		
			
	}

}
