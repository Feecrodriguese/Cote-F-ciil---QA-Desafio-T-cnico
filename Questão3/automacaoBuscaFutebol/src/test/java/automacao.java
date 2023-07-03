import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class automacao {

    @Test
    public void pesquisaSitedaGlobo() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://www.globo.com");
        navegador.manage().window().maximize();

        navegador.findElement(By.xpath("//input[@id='header-search-input']")).click();
        navegador.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("Futebol", Keys.ENTER);
        Thread.sleep(2000);

        navegador.findElement(By.xpath("//div[@class='filter-desktop filters']/div[2]/div[1]/a[1]/span[@class='filters__selected-label filter-product-color']")).click();
        Thread.sleep(2000);

        navegador.findElement(By.xpath("//div[@class='filter-desktop filters']/div[2]/div[1]/ul[1]/li[8]/span")).click();
        Thread.sleep(2000);

        navegador.findElement(By.xpath("//*[@id=\"search-filter-component\"]/div/div[1]/div/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]")).click();
        Thread.sleep(2000);

        navegador.findElement(By.xpath("//div[@aria-label='Move backward to switch to the previous month.']")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//div[@aria-label='Move backward to switch to the previous month.']")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//div[@aria-label='Move backward to switch to the previous month.']")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//div[@aria-label='Move backward to switch to the previous month.']")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//div[@aria-label='Move backward to switch to the previous month.']")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//div[@aria-label='Move backward to switch to the previous month.']")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//div[@aria-label='Move backward to switch to the previous month.']")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//div[@aria-label='Move backward to switch to the previous month.']")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]")).click();
        Thread.sleep(4000);
        navegador.findElement(By.xpath("//*[@id=\"search-filter-component\"]/div/div[1]/div/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[4]")).click();
        Thread.sleep(4000);
        navegador.findElement(By.xpath("//div[@class='range-date-filter-modal__btn-section']/button")).click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) navegador;
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);

        navegador.findElement(By.xpath("/html/body/section/div/div/ul/li[4]/div[3]/a/div[1]")).click();
        Thread.sleep(3000);

        TakesScreenshot srcshot = (TakesScreenshot) navegador;

        File src = srcshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("src\\screenshot\\new.jpg");
        FileHandler.copy(src, dest);
        Thread.sleep(3000);
        navegador.quit();
    }
}
