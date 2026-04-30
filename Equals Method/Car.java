package equals;

public class Car
{
	String model;
	String car_type;
	int cost;
	Car(String car_type, int cost, String model)
	{
		this.model=model;
		this.cost=cost;
		this.car_type=car_type;
	}
	public boolean equals(Object obj) {
		Car m2= (Car)obj;
		return this.cost==m2.cost;
	}
	public static void main(String[] args)
	{
		Car m1=new Car("petrol",400000,"Suzuki" );
		Car m2=new Car("petrol",450000,"BMW" );
		if(m1.equals(m2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}
}

