class Triangle{
	double area(int b, int h){
		double res= 0.5*h*b;
		return res;
	}
}
class Sample2{

	public static void main(String[] args)
	{
		Triangle T=new Triangle();
		double x=T.area(8,12);
		System.out.println(x);
	}
}

	