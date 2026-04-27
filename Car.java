class Car
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
	public static void main(String[] args)
	{
		Car m1=new Car("petrol",400000,"Suzuki" );
		System.out.println(m1.model);
		System.out.println(m1.car_type);
		System.out.println(m1.cost);
	}
}