class Parallelogram
{
	void area(int b ,int h)
	{
		int res=b*h;
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		Parallelogram P=new Parallelogram();
		P.area(8,10);
	}
}