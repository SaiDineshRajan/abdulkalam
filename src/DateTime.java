import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
	  //System.out.println(LocalDateTime.now());
		Date d=new Date();
		//System.out.println(d);//
		SimpleDateFormat sdt= new SimpleDateFormat("dd-MM-yyy-hh-mm-ss");
		String x=sdt.format(d);
		System.out.println(x);
		
	   
	}

}
