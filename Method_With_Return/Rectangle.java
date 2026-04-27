class Rectangle
{
	double  area(int w, int h){
		int res=w*h;
		//System.out.println(res);
		return res;
	}
	public static void main(String[]  args)
	{
		Rectangle R=new Rectangle();
		double x=R.area(8,6);
		System.out.println(x);
	}
}