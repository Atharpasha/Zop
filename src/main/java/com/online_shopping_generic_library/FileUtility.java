package com.online_shopping_generic_library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	
		public String readDtaFromPropertyFile(String key) throws IOException
		{
		FileInputStream fis=new FileInputStream(IPathConstants.filepath);
		Properties pr=new Properties();
		pr.load(fis);
		String value=pr.getProperty(key);
		return value;
		}
		
		

	


		}
		
