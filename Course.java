class Course
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
	public static void main(String[] args)
	{
		Course m1=new Course("VTU",4000,"CSE" );
		System.out.println(m1.univ_name);
		System.out.println(m1.course_name);
		System.out.println(m1.cost);
	}
}