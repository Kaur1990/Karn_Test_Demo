package karntesting;
import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Value");
	int i=sc.nextInt();
	int a=0;
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	for(int j=1;j<=i;j++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	
	
		
	
	
}
}

	
