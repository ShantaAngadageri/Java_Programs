class Sector
{
	void area(int r, int angle)
	{
		double res= 0.5*r*r*angle;
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		new Sector().area(8,60);
	}
}