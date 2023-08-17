package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		String b=Integer.toString(a);
		System.out.println(b+3);//103
		
		int c=Integer.parseInt(b);
		System.out.println(c+2);//12
		
	}

}
