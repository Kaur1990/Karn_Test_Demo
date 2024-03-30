package karntesting;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Value");
		
		int i=sc.nextInt();
		int count=0;
		if(i==1 || i==0)
		{
			System.out.println("not prime no");
		}
		for(int k=2;k<i;k++) {
			if(i%k==0){
				count++;
				break;
				
			}
			
}
		if(count==0) {
			System.out.println("it is prime no");
		}
		else {
			System.out.println("not prime no");
		}
}
	}


