
public class Calculator {

	
	int a =10;
	int b=20;
	int c;
	
	public void add()
	{
		 c = a+b;
		 System.out.println(c);
	}
	
	public int addition(int x,int y,int v)
	{
		int z;
		z = x+y;
		return z;
		
	}
	
	public int subtraction()
	{
		return a;
		
	}
	
	public int subtraction(int x)
	{
		return a;
	}
	
	

	
	public int subtraction(int x,int y,int z,int g)
	{
		return a;
	}
	
	public int subtraction(int x,double y)
	{
		return a;
	}
	
	public int subtraction(double x,int y)
	{
		return a;
	}
	
	
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		ca.add();
		int sum = ca.addition(100,200,300);
		int sub = ca.subtraction(10.009,20);
		
		System.out.println(sum+100);

	}

}
