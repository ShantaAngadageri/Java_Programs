package hellojava;
interface Demo11{
	void disp();
}
public class Eclipse {

	public static void main(String[] args) {
		Demo11 s=()->{
			double pi=3.142;
			int a=4;
			int b=9;
			double res=pi*a*b;
			System.out.println(res);
		};
		s.disp();
	}
}
