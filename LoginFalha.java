package modulos.loginerro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Web com falha")
public class LoginFalha {
    @Test
    @DisplayName("Fazer login com falha")
    public void testLoginDeFalha() {
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        // Vou maximizar a tela
        navegador.manage().window().maximize();

        //Navegar para a pagina da Product Store
        navegador.get("https://www.demoblaze.com/index.html");

        // Fazer login
        navegador.findElement(By.cssSelector("a[id='login2']")).click();
        navegador.findElement(By.id("loginusername")).sendKeys("uxgroup");

        navegador.findElement(By.cssSelector("input[id='loginpassword']")).click();
        navegador.findElement(By.id("loginpassword")).sendKeys("12345");

        navegador.findElement(By.cssSelector(" button[onclick='logIn()']")).click();


    }
}