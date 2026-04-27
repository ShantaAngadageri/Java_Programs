class Square{
	double area(int a){
		//int a=10;
		int res=a*a;
		return res;
	}
}
class Sample1
{
	public static void main(String[] args)
	{
	   Square S=new Square();
	   double x=S.area(8);
	   System.out.println(x);
	}
}