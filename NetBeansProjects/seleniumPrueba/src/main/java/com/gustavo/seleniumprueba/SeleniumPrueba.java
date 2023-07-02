package com.gustavo.seleniumprueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrueba {

    public static void main(String[] args) {
        // Establecer la ubicación del controlador de Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gustavo\\Documents\\chromedriver_win32\\chromedriver.exe");

        // Crear una instancia de ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Abrir Facebook
        driver.get("https://campusvirtual.unlar.edu.ar/login/index.php");

        // Ingresar el nombre de usuario y contraseña
        driver.findElement(By.id("username")).sendKeys("TU_NOMBRE_DE_USUARIO");
        driver.findElement(By.id("password")).sendKeys("TU_CONTRASEÑA");

        // Hacer clic en el botón de inicio de sesión
        driver.findElement(By.id("loginbtn")).click();

        // Esperar a que se cargue la página de inicio de Facebook
        // Aquí puedes realizar acciones adicionales después de iniciar sesión

        // Cerrar el navegador
//        driver.quit();
    }
}
