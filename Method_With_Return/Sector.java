class Sector
{
	double area(int r, int angle)
	{
		double res= 0.5*r*r*angle;
		//System.out.println(res);
		return res;
	}
	public static void main(String[] args)
	{
		Sector S=new Sector();
		double x=S.area(8,60);
		System.out.println(x);
	}
}