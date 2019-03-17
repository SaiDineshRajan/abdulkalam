
public class Runner {

	public static void main(String[] args) {
		Abstract xy=new Cocr();
		int a=xy.add(25, 35);
		int b=xy.subtract(35,10);
		System.out.println( a+" "+"\n"+b);
		Cocr bc=new Cocr();
		int c=bc.multiply(25,65);
		int d=bc.subtract(50,25);
		System.out.println(c+" "+"\n"+d);
		

	}

}
