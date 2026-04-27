class Parallelogram
{
	double area(int b ,int h)
	{
		int res=b*h;
		//System.out.println(res);
		return res;
	}
	public static void main(String[] args)
	{
		Parallelogram P=new Parallelogram();
		double x=P.area(8,10);
		System.out.println(x);
	}
}