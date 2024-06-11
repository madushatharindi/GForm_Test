import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QTest {

    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSexcqvtr8cMUQpWXgrXZpeKM4cBpnE-ZPd13R288n0UPtYlSQ/viewform");
        Thread.sleep(2000);
    }

    @Test
    public void testBoxTests() throws InterruptedException {

//        type your name

        WebElement name = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        name.sendKeys("Madusha");
        Thread.sleep(2000);


        WebElement box = driver.findElement(By.xpath("//*[@id=\"i10\"]/div[2]"));
        box.click();
        Thread.sleep(1000);

        WebElement box1 = driver.findElement(By.xpath("//*[@id=\"i13\"]/div[2]"));
        box1.click();
        Thread.sleep(1000);

        WebElement box2 = driver.findElement(By.xpath("//*[@id=\"i16\"]/div[2]"));
        box2.click();
        Thread.sleep(1000);

        //multiple choises

        WebElement dot1 = driver.findElement(By.xpath("//*[@id=\"i23\"]/div[3]/div"));
        dot1.click();
        Thread.sleep(1000);

        WebElement dot2 = driver.findElement(By.xpath("//*[@id=\"i26\"]/div[3]/div"));
        dot2.click();
        Thread.sleep(1000);

        WebElement dot3 = driver.findElement(By.xpath("//*[@id=\"i29\"]/div[3]/div"));
        dot3.click();



    }



    }
