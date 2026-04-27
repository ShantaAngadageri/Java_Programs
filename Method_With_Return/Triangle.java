class Triangle{
	double  area(int a, int b){
		double res= 0.5*a*b;
		//System.out.println(res);
		return res;
	}
	public static void main(String[] args)
	{
		Triangle T=new Triangle();
		double x=T.area(5,7);
		System.out.println(x);
	}
}

	