import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exerciciosWindow {
    @Test
    public void testeNewWindow() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // exercicios para abrir uma nova aba dp navegador
        driver.get("https://demo.automationtesting.in/Windows.html");
        // driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[2]/buttons[1]/p")).click();

       // driver.findElement(By.cssSelector("a.analystic[href='#Seperate']"));
        WebElement botao = driver.findElement(By.xpath("//button[text()='click']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", botao);
        Thread.sleep(2000); // espera 2 segundos
        // driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
       // driver.findElement(By.xpath("//button[text()='click']")).click();

        //driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();


        Object [] janelas = driver.getWindowHandles().toArray();
        //troca a tab, passando a referencia
        driver.switchTo().window(janelas[1].toString());
        String textNovaTab = "Selenium automates browsers. That's it!";
        String paginaHtml = driver.getPageSource();
        Assert.assertTrue(paginaHtml.contains(textNovaTab));

        driver.quit();

    }
}
