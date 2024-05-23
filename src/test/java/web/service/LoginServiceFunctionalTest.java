package web.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.*;

public class LoginServiceFunctionalTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Programs\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8080/login");
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    public void testLoginSuccess() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("passwd"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        usernameField.sendKeys("admin");
        passwordField.sendKeys("admin");
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("submit-task"));

        String pageTitle = driver.getTitle();
        assertEquals("Submit Task", pageTitle);
    }

    @Test
    public void testLoginFailure() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("passwd"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        usernameField.sendKeys("admin");
        passwordField.sendKeys("wrongpassword");
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("login"));

        String errorMessage = driver.findElement(By.id("error")).getText();
        assertEquals("Incorrect credentials", errorMessage);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
