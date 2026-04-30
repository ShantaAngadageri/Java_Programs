package equals;
public class Mobile
{
	String model_name;
	String color;
	int cost;
	Mobile(String model_name, int cost, String color)
	{
		this.model_name=model_name;
		this.cost=cost;
		this.color=color;
	}
	public boolean equals(Object obj) {
		Mobile m2= (Mobile)obj;
		return this.cost==m2.cost;
	}
	
	public static void main(String[] args)
	{
		Mobile m1=new Mobile("Vivo", 25000, "Silver");
		Mobile m2=new Mobile("Redmi", 25000, "Silver");
		if(m1.equals(m2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}
}
