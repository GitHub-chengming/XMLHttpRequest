import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class SeleniumTest {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径
        //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com/");
         
        driver.manage().window().maximize();
         
        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("欧洲杯");
         
        WebElement btn = driver.findElement(By.id("su"));
        btn.click();
        //为便于查看测试效果，可把关闭浏览器操作注释
        //driver.close();
 
    }
 
}
