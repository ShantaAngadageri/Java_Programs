package toString;

public class Course
{
	String univ_name;
	String course_name;
	int cost;
	Course(String univ_name, int cost, String course_name)
	{
		this.course_name=course_name;
		this.cost=cost;
		this.univ_name=univ_name;
	}
	public String toString() {
		return this.univ_name+" "+this.course_name+" "+this.cost;
	}
	public static void main(String[] args)
	{
		Course m1=new Course("VTU",4000,"CSE" );
		System.out.println(m1.toString());
	}
}
