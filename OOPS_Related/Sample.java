

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
class  Sample
{
public static void main(String[] args){
	Demo s1 = new Demo();
	System.out.println(s1.a);
	s1.test();
}
}