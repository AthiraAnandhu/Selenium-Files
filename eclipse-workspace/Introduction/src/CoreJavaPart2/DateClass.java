package CoreJavaPart2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd =new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		//standard way
		System.out.println(d.toString());
		// M/d/yyyy format
		System.out.println(sdf.format(d));
		// M/d/yyyy hh:mm:ss format
		System.out.println(sd.format(d));

	}

}
