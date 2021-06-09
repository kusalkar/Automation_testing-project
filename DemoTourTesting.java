package DemoTourProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoTourTesting {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("http://demo.guru99.com/test/newtours/index.php");
		w.manage().window().maximize();

		DemoTourTesting demo = new DemoTourTesting();
		demo.demoTour(w);
		demo.selenium(w);
	}

	public void demoTour(WebDriver w) throws InterruptedException {
		Thread.sleep(500);

		// register

		w.findElement(By.linkText("REGISTER")).click();
		w.findElement(By.name("firstName")).sendKeys("priti");
		w.findElement(By.name("lastName")).sendKeys("kadam");
		w.findElement(By.name("phone")).sendKeys("7208395487");
		w.findElement(By.name("userName")).sendKeys("priti3800@gmail.com");
		w.findElement(By.name("address1")).sendKeys("mankurd");
		w.findElement(By.name("city")).sendKeys("Mumbai");
		w.findElement(By.name("state")).sendKeys("maharastra");
		w.findElement(By.name("postalCode")).sendKeys("400088"); // dropdown
		w.findElement(By.name("country")).click();
		Select s = new Select(w.findElement(By.name("country")));
		s.selectByValue("BRAZIL");
		w.findElement(By.name("email")).sendKeys("priti3800@gmail.com");
		w.findElement(By.name("password")).sendKeys("12345");
		w.findElement(By.name("confirmPassword")).sendKeys("12345");
		w.findElement(By.name("submit")).click();

		// login
		w.findElement(By.linkText("sign-in")).click();
		w.findElement(By.name("userName")).sendKeys("priti3800@gmail.com");
		w.findElement(By.name("password")).sendKeys("123456");
		w.findElement(By.name("submit")).click();

		// sign off
		w.findElement(By.linkText("SIGN-OFF")).click();

		// support
		w.findElement(By.linkText("SUPPORT")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/a[1]/img[1]")).click();

		// contact us
		w.findElement(By.linkText("CONTACT")).click();
		w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]"));

		// Home
		w.findElement(By.linkText("Home")).click();

		// Flights
		Thread.sleep(500);

		w.findElement(By.linkText("Flights")).click();
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/b[1]/font[1]/input[2]")).click();

		w.findElement(By.name("passCount")).click();
		Select s1 = new Select(w.findElement(By.name("passCount")));
		s1.selectByValue("2");

		w.findElement(By.name("fromPort")).click();
		Select s2 = new Select(w.findElement(By.name("fromPort")));
		s2.selectByValue("Paris");

		w.findElement(By.name("fromMonth")).click();
		Select s3 = new Select(w.findElement(By.name("fromMonth")));
		s3.selectByVisibleText("March");

		w.findElement(By.name("fromDay")).click();
		Select s4 = new Select(w.findElement(By.name("fromDay")));
		s4.selectByValue("6");

		w.findElement(By.name("toPort")).click();
		Select s5 = new Select(w.findElement(By.name("toPort")));
		s5.selectByValue("Portland");

		w.findElement(By.xpath("//tbody/tr[7]/td[2]/select[1]")).click();
		Select s6 = new Select(w.findElement(By.xpath("//tbody/tr[7]/td[2]/select[1]")));
		s6.selectByVisibleText("November");

		w.findElement(By.name("toDay")).click();
		Select s7 = new Select(w.findElement(By.name("toDay")));
		s7.selectByValue("29");

		w.findElement(By.xpath("//tbody/tr[9]/td[2]/font[1]/font[1]/input[2]")).click();

		w.findElement(By.name("airline")).click();
		Select s8 = new Select(w.findElement(By.name("airline")));
		s8.selectByVisibleText("Pangea Airlines");

		w.findElement(By.name("findFlights")).click();

		// Hotels
		w.findElement(By.linkText("Hotels")).click();

		// Car Rentals
		w.findElement(By.linkText("Car Rentals")).click();

		// Cruises
		w.findElement(By.linkText("Cruises")).click();

		// Destinations
		w.findElement(By.linkText("Destinations")).click();

		// Vacations
		w.findElement(By.linkText("Vacations")).click();

		// Insurance Project
		// Register
		w.findElement(By.linkText("Insurance Project")).click();
		w.findElement(By.xpath("/html/body/div[3]/a")).click();

		w.findElement(By.id("user_title")).click();
		Select list = new Select(w.findElement(By.id("user_title")));
		list.selectByIndex(3);

		w.findElement(By.id("user_firstname")).sendKeys("ashwini");
		w.findElement(By.id("user_surname")).sendKeys("kusalkar");
		w.findElement(By.id("user_phone")).sendKeys("9881583318");
		w.findElement(By.id("user_dateofbirth_1i")).click();
		Select dob = new Select(w.findElement(By.id("user_dateofbirth_1i")));
		dob.selectByValue("1947");

		w.findElement(By.id("user_dateofbirth_2i")).click();
		Select frstdrop = new Select(w.findElement(By.id("user_dateofbirth_2i")));
		frstdrop.selectByIndex(5);

		w.findElement(By.id("user_dateofbirth_3i")).click();
		Select snddrop = new Select(w.findElement(By.id("user_dateofbirth_3i")));
		snddrop.selectByValue("18");

		w.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div[4]/label[2]")).click();

		w.findElement(By.id("user_licenceperiod")).click();
		Select t = new Select(w.findElement(By.id("user_licenceperiod")));
		t.selectByIndex(2);

		w.findElement(By.id("user_occupation_id")).click();
		Select id = new Select(w.findElement(By.id("user_occupation_id")));
		id.selectByIndex(2);

		w.findElement(By.id("user_address_attributes_street")).sendKeys("borudegalli");
		w.findElement(By.id("user_address_attributes_city")).sendKeys("pune");
		w.findElement(By.id("user_address_attributes_county")).sendKeys("india");
		w.findElement(By.id("user_address_attributes_postcode")).sendKeys("412001");
		w.findElement(By.id("user_user_detail_attributes_email")).sendKeys("ashwinikusalkar1996@gmail.com");
		w.findElement(By.id("user_user_detail_attributes_password")).sendKeys("12345");
		w.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("12345");
		w.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]")).click();

		// Insurance login
		w.findElement(By.id("email")).sendKeys("ashwinikusalkar1996@gmail.com");
		w.findElement(By.id("password")).sendKeys("12345");
		w.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();

		// edit profie
		w.findElement(By.linkText("Edit Profile")).click();

		w.findElement(By.id("user_title")).click();
		Select title = new Select(w.findElement(By.id("user_title")));
		title.selectByIndex(3);

		w.findElement(By.id("user_firstname")).sendKeys("ashwini");
		w.findElement(By.id("user_surname")).sendKeys("kusalkar");
		w.findElement(By.id("user_phone")).sendKeys("9881583318");
		w.findElement(By.id("user_dateofbirth_1i")).click();
		Select DOB = new Select(w.findElement(By.id("user_dateofbirth_1i")));
		DOB.selectByValue("1947");

		w.findElement(By.id("user_dateofbirth_2i")).click();
		Select DOB1 = new Select(w.findElement(By.id("user_dateofbirth_2i")));
		DOB1.selectByIndex(5);

		w.findElement(By.id("user_dateofbirth_3i")).click();
		Select DOB2 = new Select(w.findElement(By.id("user_dateofbirth_3i")));
		DOB2.selectByValue("18");

		w.findElement(By.id("user_licenceperiod")).click();
		w.findElement(By.id("user_licenceperiod")).click();
		Select ul = new Select(w.findElement(By.id("user_licenceperiod")));
		ul.selectByIndex(2);

		w.findElement(By.id("user_occupation_id")).click();
		Select u_id = new Select(w.findElement(By.id("user_occupation_id")));
		u_id.selectByIndex(2);

		w.findElement(By.id("user_address_attributes_street")).sendKeys("borudegalli");
		w.findElement(By.id("user_address_attributes_city")).sendKeys("pune");
		w.findElement(By.id("user_address_attributes_county")).sendKeys("india");
		w.findElement(By.id("user_address_attributes_postcode")).sendKeys("412001");

		w.findElement(By.xpath("//body/div[3]/div[1]/div[5]/form[1]/div[14]/input[1]")).click();

		// Insurance_Profile
		w.findElement(By.linkText("Profile")).click();

		// Insurance_request_quotation
		w.findElement(By.xpath("//a[@id='ui-id-2']")).click();

		w.findElement(By.id("quotation_breakdowncover")).click();
		Select bw = new Select(w.findElement(By.id("quotation_breakdowncover")));
		bw.selectByValue("3");

		w.findElement(By.xpath("//label[contains(text(),'YES')]")).click();

		w.findElement(By.name("incidents")).sendKeys("10");
		w.findElement(By.name("registration")).sendKeys("101");
		w.findElement(By.name("mileage")).sendKeys("8000");
		w.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1000");

		w.findElement(By.id("quotation_vehicle_attributes_parkinglocation")).click();
		Select parkinglocation = new Select(w.findElement(By.id("quotation_vehicle_attributes_parkinglocation")));
		parkinglocation.selectByValue("Public place");

		w.findElement(By.name("year")).click();
		Select year = new Select(w.findElement(By.name("year")));
		year.selectByValue("2018");

		w.findElement(By.name("month")).click();
		Select month = new Select(w.findElement(By.name("month")));
		month.selectByValue("5");

		w.findElement(By.name("date")).click();
		Select date = new Select(w.findElement(By.name("date")));
		date.selectByValue("3");

		w.findElement(By.xpath("//body/div[3]/div[1]/div[2]/form[1]/div[8]/input[1]")).click();
		w.findElement(By.xpath("//body/div[3]/div[1]/div[2]/form[1]/div[8]/input[3]")).click();

		w.navigate().back();

		// Insurance logout
		w.findElement(By.xpath("/html/body/div[3]/form/input")).click();

		System.out.println("Demo tour site testing done");
	}

	public void selenium(WebDriver w) throws InterruptedException {
		// selenium = flashmovie demo
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		// selenium = radio and checkbox demo
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a")).click();
		w.findElement(By.xpath("//*[@id=\"vfb-7-1\"]")).click();
		w.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
		w.findElement(By.xpath("//*[@id=\"vfb-7-3\"]")).click();
		w.findElement(By.xpath("//*[@id=\"vfb-6-0\"]")).click();
		w.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
		w.findElement(By.xpath("//*[@id=\"vfb-6-2\"]")).click();
		w.navigate().back();

		// selenium = Table demo
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[3]/a")).click();
		w.navigate().back();

		// accessing link
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[4]/a")).click();
		w.findElement(By.xpath("/html/body/a[1]")).click();
		w.navigate().back();

		// selenium = ajax demo
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[5]/a")).click();
		w.findElement(By.xpath("//*[@id=\"yes\"]")).click();
		w.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();
		w.navigate().back();

		// Selenium = inside outside box textbox
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Inside & Outside Block Level Tag")).click();
		w.findElement(By.xpath("/html/body/p/a")).click();
		w.navigate().back();
		// w.findElement(By.xpath("/html/body/a/div/span")).click();

		// SELENIUM = delete customer form
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Delete Customer Form")).click();
		w.findElement(By.name("cusid")).sendKeys("1");
		w.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Alert alert = w.switchTo().alert();
		alert.accept();
		alert.accept();
		w.findElement(By.xpath("/html/body/form")).click();
		w.navigate().back();

		// SELENIUM = yahoo
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Yahoo")).click();
		Thread.sleep(2000);
		w.navigate().back();

		// selenium = tooltip
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Tooltip")).click();
		w.navigate().back();

		// selenium = file upload
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("File Upload")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("E:\\priti\\notes\\27-may.docx");
		w.findElement(By.id("terms")).click();
		w.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		w.navigate().back();

		// selenium = login
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Login")).click();
		w.findElement(By.id("email")).sendKeys("ashwinikusalkar1996@gmail.com");
		w.findElement(By.id("passwd")).sendKeys("12345");
		w.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		w.navigate().back();

		// selenium = social icon
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Social Icon")).click();
		w.navigate().back();

		// selenium = selenium auto it
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Selenium Auto IT")).click();
		w.navigate().back();

		// selenium = selenium ide test
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Selenium IDE Test")).click();
		w.findElement(By.id("email")).sendKeys("ashwinikusalkar1996@gmail.com");
		w.findElement(By.id("pass")).sendKeys("12345");
		w.findElement(By.id("u_0_b")).click();
		w.navigate().back();

		// selenium = demo99 demo page
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Guru99 Demo Page")).click();
		w.navigate().back();
		
		//scroll bar
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Scrollbar Demo")).click();
		
		JavascriptExecutor ex = (JavascriptExecutor)w;
		ex.executeScript("arguments[0].scrollIntoView();",w.findElement(By.linkText("VBScript")));  // w.findElement(By.linkText("VBScript") find the last element
		Thread.sleep(2000);
		ex.executeScript("arguments[0].scrollIntoView();",w.findElement(By.linkText("SAP MM")));
		w.navigate().back();

		// selenium = file upload using sikuli Demo
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("File Upload using Sikuli Demo")).click();
		w.findElement(By.xpath("//*[@id=\"photoimg\"]")).sendKeys("E://priti//Resume//priti_CV.pdf");
		w.navigate().back();

		// selenium = cookie handling demo
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Cookie Handling Demo")).click();
		w.findElement(By.xpath("/html/body/div[2]/form/input[1]")).sendKeys("ashwinikusalkar1996@gmail.com");
		w.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("12345");
		w.findElement(By.xpath("/html/body/div[2]/form/button")).click();
		w.navigate().back();

		// Date picker demo
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.linkText("Selenium DatePicker Demo")).click();
		WebElement datetime = w.findElement(By.xpath("//body/form[1]/input[1]"));
		datetime.sendKeys("05/06/2021");
		datetime.sendKeys(Keys.TAB);
		datetime.sendKeys("0345AM");
		w.findElement(By.xpath("//body/form[1]/input[2]")).click();
		w.navigate().back();
		
		// selenium = drag and drop action
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[19]/a")).click();
	
		// WebElement on which drag and drop operation needs to be performed
		WebElement from = w.findElement(By.xpath("//*[@id=\"credit2\"]/a"));

		// WebElement to which the above objectxpat is dropped
		WebElement to = w.findElement(By.xpath("//*[@id=\"bank\"]/li"));

		// Creating object of Actions class to build composite actions
		Actions act = new Actions(w);
		// Thread.sleep(5000);
		// Performing the drag and drop action
		act.dragAndDrop(from, to).perform();
		System.out.println("Done selenium testing");

	}

}
