class Parallelogram{
	void area(int b, int h)
	{
		int res=b*h;
		System.out.println(res);
	}
}
class Sample3
{
	public static void main(String[] args)
	{
		Parallelogram P=new Parallelogram();
		P.area(6,8);
	}
}