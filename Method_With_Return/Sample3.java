class Parallelogram{
	int area(int b, int h)
	{
		int res=b*h;
        return res;
	}
}
class Sample3
{
	public static void main(String[] args)
	{
		Parallelogram P=new Parallelogram();
		double x=P.area(6,8);
		System.out.println(x);
	}
}