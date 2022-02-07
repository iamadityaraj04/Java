import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class java42 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today is: "+date);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println((calendar.get(Calendar.MONTH)+1)); // 0-11
		System.out.println(calendar.get(Calendar.YEAR));
		
		//SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String formattedDate = format1.format(date);
		System.out.println("formattedDate is: "+formattedDate);
		
		
		// We can manipulate Calendar data as well
		calendar.set(Calendar.DAY_OF_MONTH, 20);
		Date date1 = calendar.getTime();
		System.out.println("date1 is: "+date1);
	}
}