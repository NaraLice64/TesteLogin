package modulos.login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Web Sucesso")
public class LoginSucesso {
    @Test
    @DisplayName("FazerLoginSucesso")
    public void testValidarLoginDeSucesso() {
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        // Vou maximizar a tela
        navegador.manage().window().maximize();

        //Navegar para a pagina da Product Store
        navegador.get("https://www.demoblaze.com/index.html");

        // Clicar no botão Log in
        navegador.findElement(By.cssSelector("a[id='login2']")).click();

        // Inserir Username
        navegador.findElement(By.id("loginusername")).sendKeys("uxgroup");

        // Inserir Password
        navegador.findElement(By.id("loginpassword")).sendKeys("1234");

        // Clicar no botão Log in
        navegador.findElement(By.cssSelector("button[onclick='logIn()']")).click();


    }
}

