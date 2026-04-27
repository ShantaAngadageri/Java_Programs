class Bike
{
	String color;
	String brand;
	int cost;
	Bike(String color, int cost, String brand)
	{
		this.color=color;
		this.cost=cost;
		this.brand=brand;
	}
	public static void main(String[] args)
	{
		Bike m1=new Bike("pink",500000,"KTM" );
		System.out.println(m1.color);
		System.out.println(m1.brand);
		System.out.println(m1.cost);
	}
}