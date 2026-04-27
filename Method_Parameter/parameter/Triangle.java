class Triangle{
	void area(int a, int b){
		double res= 0.5*a*b;
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		Triangle T=new Triangle();
		T.area(5,7);
	}
}

	