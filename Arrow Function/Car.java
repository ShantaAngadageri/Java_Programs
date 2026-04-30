package hellojava;
interface Demo17{
	void disp();
}
public class Circle {

	public static void main(String[] args) {
		Demo17 d=()->{
			int r=8;
			double pi=3.142;
			double res=pi*r*r;
			System.out.println(res);
		};
	d.disp();
	}
	
}
