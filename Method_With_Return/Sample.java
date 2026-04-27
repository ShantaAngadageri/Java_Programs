class Rectangle
{	
	double area(int w, int h){
		int res=w*h;
		return res;
	}
}
class Sample
{

	public static void main(String[]  args)
	{
		Rectangle R=new Rectangle();
		double x=R.area(8,9);
		System.out.println(x);
	}
}