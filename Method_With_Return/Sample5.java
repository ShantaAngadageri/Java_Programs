class Circle{
	double area(int r)
	{
		//int r=10;
		double pi=3.142;
		double res=pi*r*r;
       return res;
	}
}
class Sample5
{
	public static void main(String[] args)
	{
		Circle C=new Circle();
		double x=C.area(9);
		System.out.println(x);
	}
	
}