import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExemploSeleniumTest {

    @Test
    public void TesteSelenium() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Register.html");
        //nome
        driver.findElement(By.cssSelector("input[ng-model='FirstName']")).sendKeys("Luara");
        // sobrenome
        driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("Mendes");
        //Rua
        driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea")).sendKeys(("Rua carijos 2044"));
        //email
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(("maria-fernanda-de-carvalho@tuamaeaquelaursa.com"));
        //Tel
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("13988806179");
        //Genero
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        //hobbies
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

        //Languages
        //driver.findElement((By.cssSelector("#msdd"))).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@id=\"dismiss-button-element\"]/div")).click();

        //Skills
        driver.findElement(By.xpath("//select[@id='Skills']")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
        select.selectByVisibleText("Java");

        //Country
        driver.findElement(By.xpath("//*[@id=\"countries\"]/option")).click();

        //Select country
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[7]"));
        element.click();


        //Lista de Select data de nascimento, ano
        WebElement element1 = driver.findElement(By.xpath("//select[@id='yearbox']"));   // aqui ele vai armazenar o elemento pra nao precisa duplicar
        Select select1 = new Select(element1); // aqui ele vai construir esse elemento
        select1.selectByVisibleText("2009");


        WebElement elementMes = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
        Select selectMes = new Select(elementMes);
        selectMes.selectByVisibleText("June");

        WebElement elementDia = driver.findElement(By.xpath("//select[@id='daybox']"));
        Select selectDia = new Select(elementDia);
        selectDia.selectByContainsVisibleText("1");
       // Senha
       driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("1234");

       driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("1234");
        //Botão
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).sendKeys("1234");

        //Finalizar
        Thread.sleep(1000);

        //comando para fechar o navegador
        driver.quit();

    }
}
