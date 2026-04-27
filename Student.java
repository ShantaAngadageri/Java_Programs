class Student
{
	String School_name;
	char grade;
	int Strength;
	Student(String School_name, int Strength, char grade)
	{
		this.School_name=School_name;
		this.Strength=Strength;
		this.grade=grade;
	}
	public static void main(String[] args)
	{
		Student m1=new Student("ABVP",65,'A' );
		System.out.println(m1.School_name);
		System.out.println(m1.grade);
		System.out.println(m1.Strength);
	}
}