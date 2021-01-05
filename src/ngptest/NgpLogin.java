package ngptest;


import java.io.File;
import java.io.FileNotFoundException;


import java.io.IOException;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;



import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;









public class NgpLogin  {

	

	public static void main(String[] args) throws InterruptedException, IOException, EmailException, WebDriverException, TimeoutException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = signIn();
		
		pagevalidate(driver);
		orderMethod(driver);
		
		
		
		
		
		
			
		
			
		
	}//main



	// to test order module 

	/**
	 * @param driver
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws TimeoutException
	 * @throws EmailException
	 */
	public static WebDriver orderMethod(WebDriver driver)
			throws InterruptedException, IOException, TimeoutException, EmailException {
		WebElement Inventory=driver.findElement(By.xpath("//*[@id=\"INVENTORY\"]/a"));
		
		LibraryUtils.waitforelement(driver, Inventory, 10);
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Inventory).click().build().perform();
		//Thread.sleep(5000);
		
		WebElement Vas=driver.findElement(By.xpath("//*[@id=\"VOICE ACCESS SERVICES\"]/a"));
		LibraryUtils.waitforelement(driver, Vas, 10);
		Actions vaasaction=new Actions(driver);
		vaasaction.moveToElement(Vas).click().build().perform();
		pagevalidate(driver);
		pagevalidate(driver);
		WebElement NewOrder=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[2]/div/div/section/div/div[2]/span/span[1]/div/span/form/div[2]/div[1]/div[1]/div[1]/a"));
		LibraryUtils.waitforelement(driver, NewOrder, 20);
		Actions neworder= new Actions(driver);
		neworder.moveToElement(NewOrder).click().build().perform();
		
		WebElement ItfsOrder=driver.findElement(By.xpath("//*[@id=\"ITFS NumbersId\"]"));
		ItfsOrder.click();
		
		//Thread.sleep(5000);
		WebElement go=driver.findElement(By.xpath("//*[@id=\"goBtnFromInventory\"]"));
		go.click();
		pagevalidate(driver);
		//Thread.sleep(5000);
		
		WebElement Deddicated=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[2]/div/div/section/div/div[2]/span/span/div/form/div/span[10]/div[8]/div[1]/div[2]/table/tbody/tr[1]/td/input"));
		WebElement PSTN=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[2]/div/div/section/div/div[2]/span/span/div/form/div/span[10]/div[8]/div[1]/div[2]/table/tbody/tr[2]/td/input"));
		
		boolean st1=Deddicated.isSelected();
		boolean st2=PSTN.isSelected();
		
		System.out.println("Deddicated is seleceted "+ st1);
		System.out.println("PSTN is selected "+ st2);
		
		
		
		WebElement OrgID=driver.findElement(By.xpath("//*[@id=\"OrgId\"]"));		
		Select selectorg= new Select(OrgID);
		selectorg.selectByVisibleText("19870-ADAM - F-ITXC TEST CUSTOMER AND SUPPLIER");
		
		WebElement Interconnect=driver.findElement(By.xpath("//*[@id=\"InterConnectId\"]"));
		Select selectinterconnect=new Select(Interconnect);
		selectinterconnect.selectByVisibleText("INTERCONNECT FOR GERMANY(283)");
		
		WebElement Next1=driver.findElement(By.xpath("//*[@id=\"step1_NxtBtn\"]/a"));
		Actions Next1cli= new Actions(driver);
		Next1cli.moveToElement(Next1).click().build().perform();
		driver.navigate().refresh();
       
		
		WebElement selectcountry=driver.findElement(By.xpath("//select[@name='countryList']"));
        
        selectcountry.click();
        WebElement Country=driver.findElement(By.xpath("//option[@value='AUS']"));
        Country.click();
        selectcountry.click();
        pagevalidate(driver);
        WebElement Suppiler=driver.findElement(By.id("QuantyID"));
        Suppiler.sendKeys("1");
      
        WebElement AddCountry=driver.findElement(By.id("AddOrder"));
        AddCountry.click();
		
        WebElement Editentries=driver.findElement(By.id("btnEditAllEntries_1"));
        Editentries.click();
        
        WebElement end_user_name=driver.findElement(By.id("EndUserNameAll_1"));
        end_user_name.sendKeys("Test");
        
        WebElement custcall=driver.findElement(By.id("TypeOfAnswerAtCustomerSiteAll_1"));
        Select selectcustcall= new Select(custcall);
        selectcustcall.selectByVisibleText("Live Agent");
        
        WebElement IG=driver.findElement(By.id("InvoiceGroupAll_1"));
        Select selectIG= new Select(IG);
        selectIG.selectByVisibleText("Select");
        
        WebElement OP=driver.findElement(By.id("OutpulseTypeAll_1"));
        Select selectOP=new Select(OP);
        selectOP.selectByVisibleText("Custom Outpulse");
        
        WebElement Outpulse=driver.findElement(By.id("OutpulseAll_1"));
        Outpulse.sendKeys("1234567890");
        
        WebElement CLID=driver.findElement(By.id("CLIDAll_1"));
        Select selectCLid= new Select(CLID);
        selectCLid.selectByVisibleText("Real-Time");
        
        WebElement Apply= driver.findElement(By.id("EditAllEntriesApply_1"));
        Apply.click();
        
        WebElement confirm=driver.findElement(By.id("confirmEditAll_1"));
        confirm.click();
        
        pagevalidate(driver);
        //Thread.sleep(2000);
        
        WebElement Next2=driver.findElement(By.xpath("//div[@id='step2_NxtBtn_Down']/a[@onclick='nextToContactInfo();']"));
        LibraryUtils.waitforelement(driver, Next2, 2);
        Actions Next2cli= new Actions(driver);
        Next2cli.moveToElement(Next2).click().build().perform();
        
        //Thread.sleep(2000);
        WebElement Text=driver.findElement(By.id("orderComments"));
        Text.sendKeys("Testing Order");
        
        WebElement Submit=driver.findElement(By.id("SubmitOrder"));
        Submit.click();
        
        WebElement Yes=driver.findElement(By.id("SubmitOrderYes"));
        Yes.click();
        ssTest(driver);
        //Thread.sleep(5000);
        
        String status = driver.findElement(By.xpath("//*[@id=\"orderIderrmsg\"]")).getText();
		String expectedStatus ="error";
		if (status != null) {
			if(status.contains(expectedStatus)) {
				System.out.println("Error in submitting order need to try again");
				System.out.println(status);
				ssTest(driver);
				orderMethod(driver);
			}else{
				System.out.println("order placed succesfully");
				ssTest(driver);
			}
		
		
		try {
        	//selectcountry.click();
        	//Country.click();
        	//Suppiler.click();
        	//Suppiler.sendKeys("1");
        	//Next2.click();
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			selectcountry=driver.findElement(By.xpath("//select[@name='countryList']"));
			selectcountry.click();
			Country=driver.findElement(By.xpath("//option[@value='AUS']"));
	        Country.click();
	        Suppiler=driver.findElement(By.id("QuantyID"));
	        Suppiler.click();
	        Suppiler.sendKeys("1");
	        Next2=driver.findElement(By.xpath("//div[@id='step2_NxtBtn_Down']/a[@onclick='nextToContactInfo();']"));
	        Next2.click();
	        
	        }
			//Repo=driver.findElement(By.xpath("//*[@id=\"reports\"]/a"));
			//bill=driver.findElement(By.xpath("//*[@id=\"BILLING\"]/a"));
	        }//catch end*/
		
      // till this Order have been processed and screen shot is taken
		
		//now for SNOW login and wit and returns back to the NGP
			
		//
		
		
		snow(driver);
		return driver; 
	}



	// to sign in NGP portal

	/**
	 * @return
	 * @throws EmailException 
	 * @throws TimeoutException 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static WebDriver signIn() throws InterruptedException, IOException, TimeoutException, EmailException {
		// to login to NGP Portal as a Vas Test User
		
		//vastestuser2@mallinator.com-userid
		//Vastest@12345-pswd
		
		// https://portal.tatacommunications.com
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selniumtest\\Test1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://portal.tatacommunications.com");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		pagevalidate(driver);
			
		try {	
		WebElement userid=driver.findElement(By.xpath("//*[@id=\"emailId\"]"));
		userid.sendKeys("vastestuser2@mailinator.com");
		//*[@id="emailId"]
		
		
		WebElement Pswd=driver.findElement(By.xpath("//*[@id=\"passId\"]"));
		Pswd.sendKeys("Vastest@12345");
		//*[@id="passId"]
		
		//Thread.sleep(3000);
		
		WebElement Signinbttn=driver.findElement(By.xpath("//*[@id=\"submitBtn1\"]"));
		Signinbttn.click();
		//*[@id="submitBtn1"]
		
		//Thread.sleep(10000);
		pagevalidate(driver);
		orderMethod(driver);
		return driver;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("This is  error occurs because of portal slowness or network issue");
	}
	return driver;	
			
	}
	
	
	
	//to check the snow redirection
	
	public static WebDriver snow(WebDriver driver) throws InterruptedException,IOException, TimeoutException, EmailException, JavaScriptException
	{
		try {
			pagevalidate(driver);
			String s=driver.getCurrentUrl();
			WebElement TT=driver.findElement(By.xpath("//*[@id=\"TROUBLETICKETS\"]/a"));
			Actions actionsTT=new Actions(driver);
			actionsTT.click(TT).build().perform();
			//Thread.sleep(20000);
		
			//*[@id="TROUBLETICKETS"]/a
			
			LibraryUtils.waitforelement(driver, TT, 2);
			WebElement TTDD=driver.findElement(By.xpath("//*[@id=\"LSN\"]/a"));
			LibraryUtils.waitforelement(driver, TTDD, 2);
			Actions TTDDaction=new Actions(driver);
			TTDDaction.click(TTDD).build().perform();
			//*[@id="LSN"]/a
			
			pagevalidate(driver);
			String URL=driver.getCurrentUrl();
			 
			System.out.println(URL);
			//Thread.sleep(3000);
			String test1=driver.findElement(By.xpath("//*[@id=\"xe876c84fdb700700a5d13220ad9619e3\"]/div/div[1]/h4")).getText();
			String test2="Requests";
			System.out.println(test1);
			if (test1 !=  null) {
			if (test1.contains(test2)) {
				System.out.println("Match Found");
				ssTest(driver);
				voiceReport(driver, s);	
			}
		}else {
			System.out.println("Unable to place Order");
			driver.quit();
		}
			//Thread.sleep(2000);
			return driver;
		
		//bill(driver);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is  error occurs because of portal slowness or due to network issue");
			
		}
		return driver;
		
		}


	// to check the voice reporting tab


	/**
	 * @param driver
	 * @param s
	 * @return
	 * @throws WebDriverException
	 * @throws IOException
	 * @throws EmailException
	 * @throws TimeoutException 
	 */
	public static WebDriver voiceReport(WebDriver driver, String s)
			throws WebDriverException, IOException, EmailException, TimeoutException {
		pagevalidate(driver);
		String URL1=driver.getCurrentUrl();
		System.out.println(URL1);
		
		driver.get(s);
		
		pagevalidate(driver);
	try {
		
		WebElement Repo=driver.findElement(By.xpath("/html/body/div[1]/header/span/div[4]/div/div[2]/div/ul/li[6]/a"));
		LibraryUtils.waitforelement(driver, Repo, 2);
		Actions Report= new Actions(driver);
		Report.moveToElement(Repo).click().build().perform();
	
		pagevalidate(driver);
	//Thread.sleep(2000);
	WebElement Repodd=driver.findElement(By.xpath("/html/body/div[1]/header/span/div[4]/div/div[2]/div/ul/li[6]/ul/li[2]/a"));
	Actions Reportdd= new Actions(driver);
	Reportdd.click(Repodd).build().perform();
	
	pagevalidate(driver);
	WebElement Voicerepo=driver.findElement(By.xpath("//*[@id='report_detail_3']/div[1]/div[2]/div[2]/img"));
	System.out.println(Voicerepo);
	LibraryUtils.waitforelement(driver, Voicerepo, 2);
	Actions Voicerepdd= new Actions(driver);
	Voicerepdd.moveToElement(Voicerepo).click().build().perform();
		
	} catch (Exception  e) {
		// TODO: handle exception
		System.out.println("this error is due to system slowness or network issue");
		voiceReport(driver, s);
	}	
		
	
	
	
	
	String Parent=driver.getWindowHandle();
	String URL2=driver.getCurrentUrl();
	WebElement Itfsdd=driver.findElement(By.xpath("//*[@id='lnsInBound']"));
	Actions Itfsddcli=new Actions(driver);
	Itfsddcli.click(Itfsdd).build().perform();
	
	java.util.Set<String>newwindow=driver.getWindowHandles();
	for (String string : newwindow) {
		
		driver.switchTo().window(string);
		pagevalidate(driver);
		 ssTest(driver);
		
	}
	
	String URL3=driver.getCurrentUrl();
	System.out.println(URL2 + URL3);
	
	if (!URL2.equals(URL3)) {
		
		driver.close();
		driver.switchTo().window(Parent);
	}
	
	//Thread.sleep(2000);
	
	WebElement close=driver.findElement(By.xpath("//*[@id=\"div3\"]/label"));
	Actions closedd= new Actions(driver);
	closedd.click(close).build().perform();
	
	return signout(driver);
	}



	// to take screen shot

	/**
	 * @param driver
	 * @throws WebDriverException
	 * @throws IOException
	 */
	public static void ssTest(WebDriver driver) throws WebDriverException, IOException, TimeoutException {
			try {
				TakesScreenshot Screen=(TakesScreenshot)driver;
				File source=Screen.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./Screenshot/"+driver.getTitle()+".png"));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
	}
	
	
	// to sign out

	public static WebDriver signout(WebDriver driver) throws EmailException, TimeoutException, WebDriverException, IOException {
		// TODO Auto-generated method stub
		
		pagevalidate(driver);
		WebElement sign= driver.findElement(By.xpath("//*[@id=\"changeClrId\"]"));
		Actions signdd =new Actions(driver);
		signdd.moveToElement(sign).click().build().perform();
		
		WebElement signout=driver.findElement(By.xpath("/html/body/div[1]/header/span/div[1]/div/div[4]/div[3]/div[2]/p/a"));
		LibraryUtils.waitforelement(driver, signout, 2);
		Actions signoutcl= new Actions(driver);
		signoutcl.moveToElement(signout).click().build().perform();
		
		driver.close();
		
		System.out.println("Testing done Successfully");
		return driver;
		
		
	}



	// for email we need the dependency of of appache 
	// this method is for mail sending
	/**
	 * @throws EmailException
	 */
	public static void mail() throws EmailException {
		
		 // Create the attachment 
		  EmailAttachment logOutput = new EmailAttachment();
		  logOutput.setPath("./Console Logoutput.txt");
		  logOutput.setDescription("log detail of test");
		  logOutput.setDisposition(EmailAttachment.ATTACHMENT);
		  logOutput.setName("logoutput");
		  
		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("srayaskv@gmail.com", "Sreejesh"));
		email.setSSLOnConnect(true);
		email.setFrom("srayaskv@gmail.com");
		email.setSubject("SeleniumTestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("srayas.parolathodi@tatacommunications.com");
		// add the attachment
		email.attach(logOutput);
		
		//send email
		email.send();
		
		System.out.println("email sent");
	}

	// to waiting for the page
	public static void pagevalidate(WebDriver driver) throws TimeoutException, WebDriverException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//boolean status=js.executeScript("return document.readyState").toString().equals("complete");
		for (int i=0;i<20;i++)
		{
		
			int a = i;
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				String title=driver.getTitle();
				String rejected = "Request Rejected";
				if(title.contains(rejected)) {
					System.out.println("need to contact it security team id is not redirecting");
					ssTest(driver);
				}
				System.out.println(title +" Page is fully  Loaded in "+ a +"Seconds");
				break;
			}
		
			else
			{
				System.out.println("Waiting");
				a= i++;
			}
		}
	}

}//class
