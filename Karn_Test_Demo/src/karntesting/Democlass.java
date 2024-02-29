package karntesting;

public class Democlass {

	public static void main(String[] args) {
	Human1 h1=new Human1();
	h1.speak("hello");
	MobilePhone mb=new MobilePhone();
	mb.colorDemo("Purple");
	Desktop d1=new Desktop();
	d1.sizeDemo(32);
	College cg=new College();
	cg.studentStrength(1000);
	TestSuite ts=new TestSuite();
	ts.printDemo();
	TestCase tc=new TestCase();
	tc.testType();
	TestStep tsp=new TestStep();
	tsp.testDetails();
	
	}
}


class Human1
{
	String name="Bismeet";
	public void speak(String content)
	{
		System.out.println(name +"-"+content);
	}


}

class MobilePhone
{
	String Brand="Apple";
	public void colorDemo(String color) 
	{
		System.out.println(Brand + "-"+color);
	}
}


class Desktop
{
	String Brand="LG";
	public void sizeDemo(int size)
	{
		System.out.println(Brand + "-"+size);
	}

}


class College
{
	String Name="DAV";
	public void studentStrength(int strength)
	{
		System.out.println(Name+ "-"+strength);
	}

}

class TestSuite
{

	String A="XYZ";
	public void printDemo()
	{
		System.out.println(A);
	}
}


class TestCase
{
	String Test1="loopCase";

	public void testType()
	{
		System.out.println(Test1);
	}
}


class TestStep
{
	String Teststep1="Check datatype";
	public void testDetails()
	{
		System.out.println(Teststep1);
	}

}


