class Overriding
{
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void add(double a, int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a, double b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		add(5,6);
		add(4.6, 9);
		add(2,8.7, 15);
	}	
}