package com.online_shopping_generic_library;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandom()
	{
		Random random=new Random();
		int r=random.nextInt(500);
		return r;
	}
	public String getSysDate()
	{
		Date d=new Date();
		String date=d.toString();
		return date;
		
	}
	public String getSysDateFormat()
	{
		SimpleDateFormat dateformate=new SimpleDateFormat("dd/mm//yyyy HH-MM-SS");
		Date date=new Date();
		String sysdateformat= dateformate.format(date);
		return sysdateformat;
	}
		
}

	


