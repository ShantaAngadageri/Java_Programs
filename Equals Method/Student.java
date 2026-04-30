package equals;
public class Student
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
	public boolean equals(Object obj) {
		Student m2= (Student)obj;
		return this.grade==m2.grade;
	}
	public static void main(String[] args)
	{
		Student m1=new Student("ABVP",65,'A' );
		Student m2=new Student("GHS",45,'B' );
		if(m1.equals(m2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}
}
