package karntesting;

import java.util.Scanner;

public class Array2DTranspose {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 9 Values");

		int arr[][]=new int[3][3];
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				int m=sc.nextInt();
				arr[i][j]=m;

			}

		}
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		

		int transposearr[][]=new int[3][3];
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				transposearr[j][i]=arr[i][j];
			}
		}
		for (int i=0;i<3;i++)
		{
		for (int j=0;j<3;j++)
		{
		if(i==j) {
					transposearr[i][j]=0;
				}
			}
		
			}
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(" "+transposearr[i][j]);
			}
			System.out.println();
		}
	}
}
