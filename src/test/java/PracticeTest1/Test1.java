package PracticeTest1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
		
		public void test1()
		{
			String browser=System.getProperty("browser");
			Reporter.log("prcticetest1", true);
			Reporter.log(browser, true);
			//conflict msg
		}
}


