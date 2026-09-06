import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExerciciosTab {

    @Test
    public void testeTabsWindows(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.automationtesting.in/Windows.html");
       // driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[2]/buttons[1]/p")).click();

        driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click(); //abrir nova tab  do navegador
        //mapeando todas as tabs abertas
        Object [] janelas = driver.getWindowHandles().toArray(); // listando todas as tabs abertas e depois transforma em array
        //troca a tab, passando a referencia
        driver.switchTo().window(janelas[1].toString());

        String textNovaTab = "Selenium automates browsers. That's it!";
        String paginaTotal = driver.getPageSource(); // pega todo html da pagina
        Assert.assertTrue(paginaTotal.contains(textNovaTab));// faz validação se existe o texto na pagina

        driver.quit();

    }
}
