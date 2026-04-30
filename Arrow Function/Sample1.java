package hellojava;

interface Demo1{
	void disp(int b , int h);
}

public class Sample1 {
	public static void main(String[] args) {
 	   Demo1 d1=(int b,int h) -> { 
 		  double res=0.5*b*h;
 		   System.out.println(res);
 		};
 		d1.disp(8,12); 
    }
}
