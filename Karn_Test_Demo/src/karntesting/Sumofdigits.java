package karntesting;

import java.util.*;

public class Sumofdigits {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Positive Value");
		int i=sc.nextInt();
		int sum=0;

		while(i!=0)
		{
			int j;
			j=i%10;
			i=i/10;
			sum=sum+j;

		}
		System.out.println("sum is:" + sum);

	}
}
