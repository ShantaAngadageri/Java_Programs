class Employee
{
	private int emp_id=122;
	public int getId(){
		return emp_id;
	}
	public void setId(int emp_id)
	{
		this.emp_id=emp_id;
	}
}
public class main3
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		System.out.println(e.getId());
		e.setId(86);
		System.out.println(e.getId());
	}
}