package karntesting;

import java.util.*;
public class Display_time {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value in Seconds");
		int i=sc.nextInt();
		int hours=i/3600;
		int minutes=(i%3600)/60;
		int seconds=(i%60);
		
		System.out.println("Hours"+"  "+hours);
		System.out.println("Minutes"+"  "+minutes);
		System.out.println("Seconds"+"  "+seconds);
	}

}
