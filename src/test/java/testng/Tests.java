package testng;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.google.common.io.Files;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Tests  {		
	    private WebDriver driver;		
		
	    
	    
//	    @FindBy(css = "RveJvd snByac")
//	    private WebElement login_button;
//	    
//	    @FindBy(xpath = "//span[@class='RveJvd snByac']")
//	    private WebElement password;
	    
//	    By passwordLocator = By.xpath("//span[@class='RveJvd snByac']");
	    	    
	    @BeforeTest	
		public void testEasy() throws IOException {
	    	
	     	
	    	try{	    
	
	    				driver.get("https://gmail.com");  
	    				
					 	WebDriverWait a1 = new WebDriverWait(driver, 30);
						WebElement aa1 = a1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
						aa1.sendKeys("Certificatessend");
						
			
						WebDriverWait a2 = new WebDriverWait(driver, 30);
						WebElement aa2 = a2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='RveJvd snByac']")));
						aa2.click();
				 
						WebDriverWait a35 = new WebDriverWait(driver, 30);
						WebElement aa35 = a35.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
						aa35.sendKeys("[bg-[jg1997");
						
						WebDriverWait a3 = new WebDriverWait(driver, 30);
						WebElement aa3 = a3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='RveJvd snByac']")));
						aa3.click();
					

							try {
		        	   
									WebDriverWait wait = new WebDriverWait(driver, 15);
									WebElement a11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='gb_ma']")));
		            	
						
									} catch (Exception e1) {
		      				  			    System.out.println("Login failed");
									}  
							
	    	}catch (Exception e) {
	    			System.out.println("Not found element");
		       	    		
	    	}  	
	    }
		        		   

	    	@Test				
			public void testEasy2() throws IOException {
		    	
		     	
		    	try{	    	
			  	
		    		
						WebDriverWait a4 = new WebDriverWait(driver, 30);
						WebElement aa4 = a4.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='gb_ya gbii']")));
						aa4.click();
						
						WebDriverWait a5 = new WebDriverWait(driver, 30);
						WebElement aa5 = a5.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='gb_71']")));
						aa5.click();
						
							 try {
					        	   
					            	WebDriverWait wait = new WebDriverWait(driver, 15);
					            	WebElement a1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
					            	
									
					      			} catch (Exception e1) {
					      				System.out.println("Exit  failed");
					     		 }    	 
						
		    	}catch (Exception e) {
		    		System.out.println("Not found element");
       	    		
       	    	}  	
	    	}
				
	    	
	    	
	    	@Test	
	    	public void testEasy7() {
	    		
	    	try {
		    	  	 
	    		WebDriverWait a2 = new WebDriverWait(driver, 30);
				WebElement aa2 = a2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='RveJvd snByac']")));
				aa2.click();
		 
				WebDriverWait a35 = new WebDriverWait(driver, 30);
				WebElement aa35 = a35.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
				aa35.sendKeys("[bg-[jg1997");Thread.sleep(1500);
				
			
				
				WebDriverWait a3 = new WebDriverWait(driver, 30);
				WebElement aa3 = a3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='RveJvd snByac']")));
				aa3.click();
				

						WebDriverWait a4 = new WebDriverWait(driver, 30);
						WebElement aa4 = a4.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")));
						aa4.click();
						
						WebDriverWait a5 = new WebDriverWait(driver, 30);
						WebElement aa5 = a5.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@rows='1']")));
						aa5.sendKeys("certificatessend@gmail.com");
						
						WebDriverWait a34 = new WebDriverWait(driver, 30);
						WebElement aa34 = a34.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='subjectbox']")));
						aa34.sendKeys("test");
						
						WebDriverWait a351 = new WebDriverWait(driver, 30);
						WebElement aa351 = a351.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Am Al editable LW-avf']")));
						aa351.sendKeys("Teest test testik");
						
						
						WebDriverWait a234 = new WebDriverWait(driver, 30);
						WebElement aa234 = a234.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]/table/tbody/tr/td/div/div[2]/div")));
						aa234.click();
						
						
					    		}catch(Exception e) {
					    		System.out.println("Not found element");
					    	}
		            	
			            	try {
			            		
			            		
			            		WebDriverWait wait1 = new WebDriverWait(driver, 15);
				            	WebElement a112 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='link_vsm']")));
				            	a112.click();
				            	
				            	System.out.println("Succesfull");
				            	
				      			} catch (Exception e1) {
				      				System.out.println("Letter not delivered");
				     		 }    	 
			            	
						
		    	  	 
		    	  	 
		    	  	 
	    	}
 	    
		@BeforeSuite
		public void beforeTest() {	
			try { 	 
				DesiredCapabilities capability = DesiredCapabilities.chrome();
				capability.setCapability("ignoreZoomSetting", true);
				driver=new RemoteWebDriver(new URL("http://localhost:5558/wd/hub"), capability);
				driver.manage().window().maximize();
			        } catch (Exception e) {
			            throw new IllegalStateException("Can't start Web Driver", e);
			        }
				    } 
		
		
		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	

