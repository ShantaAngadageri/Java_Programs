package hellojava;
interface Demo16{
	void disp(int a, int b, int h);
}
public class Trapazoid2 {
	public static void main(String[] args) {
		Demo16 d=(int a , int b, int h)->{
			double res=0.5*(a+b)*h;
			System.out.println(res);
		};
		d.disp(5, 10,8);
	}
}
