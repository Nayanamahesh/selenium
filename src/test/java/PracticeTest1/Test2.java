package PracticeTest1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2{
	
	@Test
		
		public void test1()
		{
			String browser=System.getProperty("browser");
			Reporter.log("prcticetest2", true);
			Reporter.log(browser, true);
		}
}


