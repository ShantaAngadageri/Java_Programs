package hellojava;
interface Demo7{
	void disp(int b, int h);
}
public class Paralel1 {
	public static void main(String[] args) {
		   Demo7 d=(int b, int h)->{
			   int res=b*h;
			   System.out.println(res);
		   };
		   d.disp(12,14);
	   }
}
