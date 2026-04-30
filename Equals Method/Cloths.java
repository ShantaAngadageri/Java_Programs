package equals;

public  class Cloths
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
	public boolean equals(Object obj) {
		Cloths m2= (Cloths)obj;
		return this.cost==m2.cost;
	}
	public static void main(String[] args)
	{
		Cloths m1=new Cloths("pink",50000,"XL" );
		Cloths m2=new Cloths("red",50000,"L" );
		if(m1.equals(m2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}
}
