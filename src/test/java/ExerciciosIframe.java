import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciciosIframe {

    WebDriver driver;  // escopo global/ todas os metodos tem visualização

        @Before
        public void before() {
            driver = new ChromeDriver();
            driver.get("https://demo.automationtesting.in/Frames.html");
        }

    @Test
  public void  testeIframeEx08() {  //criei um metodo

        WebElement iframe = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(iframe);
        WebElement inputElement = driver.findElement(By.tagName("Input")); // variavel
        String text = "Teste QA";
        inputElement.sendKeys(text);
        Assert.assertTrue(driver.getPageSource().contains("iFrame Demo")); // encontrar esse texto na tela


  }
  @After
  public void after() {
          driver.quit();

  }

}
