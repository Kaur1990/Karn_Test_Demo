package karntesting;
import java.util.*;
public class ArrayDemo {
public static void main(String[] args) {
//	int[] arr= {10,20,30,40,50};
//	for(int i=0;i<5;i++) {
//		System.out.println(arr[i]);
//	}
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter 5 integer values for an array");
//	int[] arr=new int[5];
//	for(int i=0;i<5;i++) {
//			int a=sc.nextInt();
//			arr[i]=a;
//	}
//	System.out.println(arr.length);
//	for(int i=0;i<5;i++) {
//		System.out.println("array values are="+arr[i]);
//	}
	//2D array
	int student1marks[]= {12,23,34,45,56};
	int student2marks[]= {10,20,30,40,50};
	int student3marks[]= {9,67,78,89,90};
	int student4marks[]= {2,4,6,8,10};
	int allstudents[][]={
		student1marks,
		student2marks,
		student3marks,
		student4marks,
	};
	System.out.println("length is"+allstudents.length);
	System.out.println("len is"+student1marks.length);
//	int allstudent[][]= {
//			{12,23,34,45,56},
//			{10,20,30,40,50},
//			{9,67,78,89,90},
//			{2,4,6,8,10},
//	};
//	for(int i=0;i<allstudents.length;i++) {
//		for(int j=0;j<student1marks.length;j++) {
//			System.out.println(allstudents[i][j]);
//		}
//	}
	for(int[] studmark:allstudents) {
		for(int k:studmark) {
			System.out.print(k+" ,");
		}
	System.out.println();
	}
	for(int i=0;i<5;i++) {
		for(int j=5;j>i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
