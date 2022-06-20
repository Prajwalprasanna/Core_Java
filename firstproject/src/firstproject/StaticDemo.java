package firstproject;

public class StaticDemo 
{
	static int a=10;
	static int b;
	static int c=20;
	int x=10;
	static void func1()
	{
		System.out.println("the values are");
		System.out.println("a value is"+a);
		System.out.println("b value is"+b);
		System.out.println("c avlue is"+c);
	}
	static void func2()
	{
		 int d=19;
		 	System.out.println("d value is"+d);
		 	System.out.println("c value is"+c);
	}
	void func3()
	{
		System.out.println("x value is"+x);
	}
	static
	{ 
		System.out.println("Hi I am in static block");
		//System.exit(0);
	}
	public static void main(String[] args) 
	{
		System.out.println("c value is"+StaticDemo.c);
		
		StaticDemo obj=new StaticDemo();
		
		obj.func1();
		StaticDemo.func2();
		obj.func3();
	}

}
