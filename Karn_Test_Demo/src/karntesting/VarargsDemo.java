package karntesting;

public class VarargsDemo {
public static void main(String[] args) {
	MethodDemo md=new MethodDemo();
	int sum=md.add(13,23,34,45,56);
	int sum1=md.add(12,45);
	int sum2=md.add(23,45,67);
	System.out.println(sum);
	System.out.println(sum1);
	System.out.println(sum2);
}
}
class MethodDemo{
	public int add(int...input) {
		int sum=0;
		for(int i:input) {
			sum=sum+i;
		}
		return sum;
	}
}