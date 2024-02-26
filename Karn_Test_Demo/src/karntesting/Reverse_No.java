package karntesting;

import java.util.*;
public class Reverse_No {
public static void main(String[] args) {
	

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any Positive Value");
	int i=sc.nextInt();
	int reverse=0;

	while(i!=0)
	{
		int j;
		j=i%10;
		i=i/10;
		reverse=reverse*10+j;

	}
	System.out.println("reverse is:" + reverse);

}
}
