class Rectangle
{	
	void area(){
		int w=8;
		int h=9;
		int res=w*h;
		System.out.println(res);
	}
}
class Sample1
{

	public static void main(String[]  args)
	{
		Rectangle R=new Rectangle();
		R.area();
	}
}