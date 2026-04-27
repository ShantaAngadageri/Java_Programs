class TV
{
	String brand;
	String type;
	int cost;
	TV(String brand, int cost, String type)
	{
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}
	public static void main(String[] args)
	{
		TV m1=new TV("Sony",50000,"LED" );
		System.out.println(m1.brand);
		System.out.println(m1.type);
		System.out.println(m1.cost);
	}
}