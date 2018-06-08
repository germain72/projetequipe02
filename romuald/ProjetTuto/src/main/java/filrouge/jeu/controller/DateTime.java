package filrouge.jeu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

		static private SimpleDateFormat dateFormat ;

		static public Date getDateFormat(String pdate,String pattern) {
		Date ldate;
		if (pattern.equals("")) {pattern= "dd/MM/yyyy";}
		dateFormat = new SimpleDateFormat(pattern);
		try {
		ldate = dateFormat.parse(pdate);
		}
		catch(Exception ex)
		{
		ldate = new Date();
		}
		return ldate;
		}
		
		static public String getStringFormat(Date pDate, String pattern) {
		String lDate;
		if (pattern.equals("")) {pattern="dd/MM/yyy";}
		dateFormat = new SimpleDateFormat(pattern);
		try {
		lDate=dateFormat.format(pDate);
		}
		catch(Exception ex) {
		lDate = new String ();
		}
		return lDate;
		}

}
