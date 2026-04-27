class Square
{
	double area(int a){
		int res=a*a;
		//System.out.println(res);
		return res;
	}
	public static void main(String[] args)
	{
	   Square S=new Square();
	   double x=S.area(10);
	   System.out.println(x);
	}
}