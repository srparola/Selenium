package ngptest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import java.io.IOException;
import java.util.concurrent.TimeoutException;


import org.apache.commons.mail.EmailException;


import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;


public class mySanityTest {
  @Test
public void f() throws InterruptedException, IOException, TimeoutException, EmailException {
	  NgpLogin.signIn();
  System.out.println("Test done");
  Reporter.log("Default method run");
  
 
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("======Starting Test======");
  }
 @AfterMethod
  public void screenShot(ITestResult result) throws EmailException {
	 
	 
	 if (ITestResult.FAILURE==result.getStatus()) {
	 NgpLogin.mail();  
	 }
	  
  }

  @AfterClass
  public void afterClass() throws EmailException {
	  NgpLogin.mail();  
  }

}
