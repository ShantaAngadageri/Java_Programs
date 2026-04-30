package toString;

public class Employee
{
	char grade;
	//String type;
	int emp_id;
	int salary;
	Employee(char grade, int emp_id, int salary)
	{
		this.grade=grade;
		this.emp_id=emp_id;
		this.salary=salary;
	}
	public String toString() {
		return this.grade+" "+this.emp_id+" "+this.salary;
	}
	public static void main(String[] args)
	{
		Employee m1=new Employee('A',112,50000 );
		System.out.println(m1.toString());
	}
}
