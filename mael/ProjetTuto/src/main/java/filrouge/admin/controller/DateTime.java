package filrouge.admin.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	static private SimpleDateFormat dateFormat;

	static public Date getDateFormat(String pdate, String pattern) {
		Date ldate;
		if (pattern.equals("")) {
			pattern = "dd/MM/yyyy";
		}
		dateFormat = new SimpleDateFormat(pattern);
		try {
			ldate = dateFormat.parse(pdate);
		} catch (Exception ex) {
			ldate = new Date();
		}
		return ldate;
	}

}