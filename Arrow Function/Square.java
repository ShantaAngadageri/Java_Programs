package hellojava;
interface Demo9{
	void disp();
}
public class Square {
 public static void main(String[] args) {
	 Demo9 d=()->{
		 int a=9;
		 int res=a*a;
		 System.out.println(res) ;
		 };
		 d.disp();
 }
}
