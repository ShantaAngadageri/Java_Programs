class Employee
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
	public static void main(String[] args)
	{
		Employee m1=new Employee('A',112,50000 );
		System.out.println(m1.grade);
		System.out.println(m1.emp_id);
		System.out.println(m1.salary);
	}
}