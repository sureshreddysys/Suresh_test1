package Selenium1;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class seleniumCode {
static WebDriver driver = null;
public static void main(String[] args) {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\selenium eclipse\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
//driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://demoqa.com/");
Random rd1 = new Random();
int rdnum = rd1.nextInt();
driver.findElement(By.xpath("//*[@id='menu-item-374']/a")).click();
driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys("QAFirstName"+rdnum);
driver.findElement(By.xpath("//input[@id='name_3_lastname']")).sendKeys("QALastName"+rdnum);
driver.findElement(By.xpath("//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
driver.findElement(By.xpath("//*[@id='pie_register']/li[3]/div/div/input[3]")).click();
WebElement country = driver.findElement(By.id("dropdown_7"));
Select sel_country = new Select(country);
sel_country.selectByVisibleText("United States");
Random rd = new Random();
int rdnum1 = rd.nextInt(12);
WebElement dobMonth = driver.findElement(By.id("mm_date_8"));
Select sel_dobMonth = new Select(dobMonth);
//sel_dobMonth.selectByVisibleText("8");
sel_dobMonth.selectByIndex(rdnum1);
WebElement dobDay = driver.findElement(By.id("dd_date_8"));
Select sel_dobDay = new Select(dobDay);
//sel_dobDay.selectByVisibleText("19");
sel_dobDay.selectByIndex(rdnum1);
WebElement dobYear = driver.findElement(By.id("yy_date_8"));
Select sel_dobYear = new Select(dobYear);
//sel_dobYear.selectByVisibleText("1987");
sel_dobYear.selectByIndex(rdnum1);
driver.findElement(By.id("phone_9")).sendKeys("2456541432");
driver.findElement(By.id("username")).sendKeys("demoqa_user" + rdnum);
driver.findElement(By.id("email_1")).sendKeys("abcxyz" + rdnum +"@gmail.com");
driver.findElement(By.id("password_2")).sendKeys("pwd_user"+rdnum);
driver.findElement(By.id("confirm_password_password_2")).sendKeys("pwd_user"+rdnum);
driver.findElement(By.xpath("//*[@id='pie_register']/li[14]/div/input")).sendKeys(Keys.ENTER);
String Actual_Regis_success_message = driver.findElement(By.xpath("//*[@id='post-49']/div/p")).getText();
if(Actual_Regis_success_message.equals("Thank you for your registration")){
System.out.println("Regsitration Success");
} else{
System.out.println("Regsitration is failure");
}
driver.findElement(By.xpath("//*[@id='menu-item-140']/a")).click();
WebElement dragble = driver.findElement(By.id("draggable"));
Actions ac = new Actions(driver);
ac.dragAndDropBy(dragble, 50, 40).build().perform();
driver.findElement(By.xpath("//*[@id='menu-item-141']/a")).click();
WebElement drag_ele = driver.findElement(By.id("draggableview"));
WebElement drop_ele = driver.findElement(By.id("droppableview"));
ac.dragAndDrop(drag_ele, drop_ele).build().perform();
driver.findElement(By.xpath("//*[@id='menu-item-143']/a")).click();
WebElement resizable_ele = driver.findElement(By.id("resizable"));
ac.clickAndHold(resizable_ele).moveByOffset(50, 50).release().build().perform();
driver.findElement(By.xpath("//*[@id='menu-item-142']/a")).click();
//WebElement selectable_ele = driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
int rd_selectable = rd.nextInt(7);
driver.findElement(By.xpath("//*[@id='selectable']/li[" + rd_selectable+"]")).click();
driver.findElement(By.xpath("//*[@id='menu-item-151']/a")).click();
driver.findElement(By.xpath("//*[@id='sortable']/li[" + rd_selectable+"]")).click();
driver.findElement(By.xpath("//*[@id='menu-item-38']/a")).click();
String Actual_homepage_message = driver.findElement(By.xpath("//*[@id='menu-item-38']/a")).getText();
if(Actual_homepage_message.equals("Home")){
System.out.println("Home Tab text displayed correctly");
} else{
System.out.println("Home Tab text is not displayed correctly");
}
String Actual_aboutus_message = driver.findElement(By.xpath("//*[@id='menu-item-158']/a")).getText();
if(Actual_aboutus_message.equals("About us")){
System.out.println("About us Tab text displayed correctly");
} else{
System.out.println("About us Tab text is not displayed correctly");
}
String Actual_services_message = driver.findElement(By.xpath("//*[@id='menu-item-155']/a")).getText();
if(Actual_services_message.equals("Services")){
System.out.println("Services Tab text displayed correctly");
} else{
System.out.println("Services Tab text is not displayed correctly");
}
String Actual_demo_message = driver.findElement(By.xpath("//*[@id='menu-item-66']/a")).getText();
if(Actual_demo_message.equals("Demo")){
System.out.println("Demo Tab text displayed correctly");
} else{
System.out.println("Demo Tab text is not displayed correctly");
}
String Actual_blog_message = driver.findElement(By.xpath("//*[@id='menu-item-65']/a")).getText();
if(Actual_blog_message.equals("Blog")){
System.out.println("Blog Tab text displayed correctly");
} else{
System.out.println("Blog Tab text is not displayed correctly");
}
String Actual_Contact_message = driver.findElement(By.xpath("//*[@id='menu-item-64']/a")).getText();
if(Actual_Contact_message.equals("Contact")){
System.out.println("Contact Tab text displayed correctly");
} else{
System.out.println("Contact Tab text is not displayed correctly");
}
driver.findElement(By.xpath("//*[@id='menu-item-148']/a")).click();
driver.findElement(By.id("ui-id-2")).click();
String Actual_opennew_separate_win_message = driver.findElement(By.xpath("//*[@id='tabs-2']/div/p/a")).getText();
if(Actual_opennew_separate_win_message.equals("Open New Seprate Window")){
System.out.println("Open New Seprate Window  text displayed correctly");
} else{
System.out.println("Open New Seprate Window text is not displayed correctly");
}
driver.findElement(By.xpath("//*[@id='site_navigation']/div/div[1]/a/img")).click();
}
}
