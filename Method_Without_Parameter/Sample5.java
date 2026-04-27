class Circle{
	void area()
	{
		int r=10;
		double pi=3.142;
		double res=pi*r*r;
		System.out.println(res);
	}
}
class Sample5
{
	public static void main(String[] args)
	{
		Circle C=new Circle();
		C.area();
	}
	
}