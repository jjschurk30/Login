package com.practice.login;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginControllerTest {

    @Test
    public void TestLogin() {


        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");

        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("username")).sendKeys("jjschurk30@xyz.com");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.id("login")).click();




        String actualUrl ="http://localhost:8080/";
        String expectedUrl = driver.getCurrentUrl();

        //Assert
        Assert.assertEquals(expectedUrl, actualUrl);

        if(actualUrl.equalsIgnoreCase(expectedUrl))
            {
                System.out.println("You have Logged In");
            }
        else
            {
                System.out.println("Login Failed: Your Username or Password Do Not Match");
            }

    }
}
