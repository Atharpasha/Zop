package TestNg_Practice_Test;

import org.testng.annotations.Test;

import com.online_shopping_generic_library.BaseClass;

public class T5_Test extends BaseClass {
@Test(groups="smoke")
public void acc()
{
	System.out.println("--A--1");
}
@Test
public void az()
{
	System.out.println("--A--2");
}

}
