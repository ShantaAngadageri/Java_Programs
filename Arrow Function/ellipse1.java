package hellojava;

interface Demo12{
	void disp(int a, int b);
}
public class Eclipse1 {
	public static void main(String[] args) {
		Demo12 d=(int a, int b)->{
			double pi=3.142;
			double res=pi*a*b;
			System.out.println(res);
			
		};
		d.disp(4, 7);
	}

}
