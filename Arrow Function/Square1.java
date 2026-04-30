package hellojava;

interface Demo10{
	void disp(int a);
}
public class Square1 {

	 public static void main(String[] args) {
		 Demo10 d=(int a)->{
			 int res=a*a;
			 System.out.println(res);

		 };
		 d.disp(7);
	 }
}
