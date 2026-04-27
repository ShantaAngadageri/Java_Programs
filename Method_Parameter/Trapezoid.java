class Trapezoid
{
	void area(int a, int b, int h)
	{

		double res=0.5*(a+b)*h;
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		new Trapezoid().area(6,8,12);
	}
			
}