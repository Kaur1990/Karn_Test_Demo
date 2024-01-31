package karntesting;

import java.util.*;
public class DisplayMonths {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any value between 1 to 12");
		int i =sc.nextInt();
		System.out.println("Enter any year");
		int j= sc.nextInt();
		
		switch(i)
		{
		case 1:
			System.out.println("This is Jan Month having 31 Days");
			break;
			
		case 2:
			if(j%4==0)
			System.out.println("This is a Feb Month having 29 Days");
			else
				System.out.println("This is a Feb Month having 28 Days");
			break;
			
		case 3:
			
			System.out.println("This is a March Month having 31 Days");
			break;
			
		case 4:
			
			System.out.println("This is a April Month having 30 Days");
			break;
			
		case 5:
			
			System.out.println("This is a May Month having 31 Days");
			break;
			
		case 6:
			
			System.out.println("This is a June Month having 30 Days");
			break;
			
		case 7:
			System.out.println("This is a July Month having 31 Days");
			break;
			
		case 8:
			System.out.println("This is a Aug Month having 31 Days");
			break;
			
		case 9:
			System.out.println("This is a Sept Month having 30 Days");
			break;
			
		case 10:
			System.out.println("This is a Oct Month having 31 Days");
			break;
			
		case 11:
			System.out.println("This is a Nov Month having 30 Days");
			break;
			
		case 12:
			System.out.println("This is a Dec Month having 31 Days");
			break;
			
			
			
		}
		
	}

	
}
