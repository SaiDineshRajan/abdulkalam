import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class NewDate {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		Date d=new Date();
			System.out.println(d);
		SimpleDateFormat dt=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
	String x=dt.format(d);
	System.out.println(x);
		

	}

}
