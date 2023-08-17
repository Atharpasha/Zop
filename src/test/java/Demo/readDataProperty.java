package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readDataProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Demo1\\commondata.properties");
 Properties pr=new Properties();
 pr.load(fis);
 String URL=pr.getProperty("url");
 String Browser=pr.getProperty("browser");
 String Username=pr.getProperty("username");
 String Password=pr.getProperty("password");
 System.out.println(URL);
 System.out.println(Browser);
 System.out.println(Username);
 System.out.println(Password);
 
	}

}
