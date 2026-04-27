class Circle
{
	double area(int r)
	{
		
		double pi=3.142;
		double res=pi*r*r;
		return res;
		//System.out.println(res);
	}
	public static void main(String[] args)
	{
		Circle C=new Circle();
		double x=C.area(16);
		System.out.println(x);
	}
	
}