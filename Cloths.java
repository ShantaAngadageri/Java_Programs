class Cloths
{
	String color;
	String size;
	int cost;
	Cloths(String color, int cost, String size)
	{
		this.color=color;
		this.cost=cost;
		this.size=size;
	}
	public static void main(String[] args)
	{
		Cloths m1=new Cloths("pink",500000,"XL" );
		System.out.println(m1.color);
		System.out.println(m1.size);
		System.out.println(m1.cost);
	}
}