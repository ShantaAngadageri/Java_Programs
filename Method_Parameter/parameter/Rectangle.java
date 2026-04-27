class Rectangle
{
	void area(int w, int h){
		int res=w*h;
		System.out.println(res);
	}
	public static void main(String[]  args)
	{
		Rectangle R=new Rectangle();
		R.area(8,6);
	}
}