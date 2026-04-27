
class  Sample
{
class Sample1
{
	int a=10;
	
}
class Demo extends Sample1
{
	void test(){
		System.out.println("Single level inheritane");
}
}
public static void main(String[] args){
	Sample1 s1 = new Sample1();
	System.out.println(s1.a);
	s1.test();
}
}