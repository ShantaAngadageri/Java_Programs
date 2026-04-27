class Triangle{
	void area(int b, int h){
		double res= 0.5*h*b;
		System.out.println(res);
	}
}
class Sample1{

	public static void main(String[] args)
	{
		Triangle T=new Triangle();
		T.area(8,12);
	}
}

	