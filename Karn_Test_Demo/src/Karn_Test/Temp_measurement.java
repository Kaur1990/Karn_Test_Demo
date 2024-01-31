package Karn_Test;
import java.util.*;
import java.lang.*;
public class Temp_measurement {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any Value");
		
		float Cel= sc.nextFloat();
		double Farhen =1.8*Cel+(double)32;
		double Kelvin=Cel+273;
		System.out.println("Farhen" + Farhen);
        System.out.println("Kelvin" + Kelvin);
		
	}




}
