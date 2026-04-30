package hellojava;
interface Demo13{
	 double disp();
}
public class Eclipse2 {
	public static void main(String[] args) {
		Demo13 d=()->{
			double pi=3.142;
			int a=12;
			int b=7;
			double res=pi*a*b;
			return res;
		};
		System.out.println(d.disp());
	}

}
