
public class Splits {

	public static void main(String[] args) {
		String x="My%name@is@khan";
		String y[]=x.split("%");
		String z[]=x.split("@");
		System.out.println(y.length);
		System.out.println(z.length);
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
			
		}
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}
	}

}
