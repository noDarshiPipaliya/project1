package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        WebElement registerlink = driver.findElement(By.linkText("Register"));
        registerlink.click();
        String expectedMessage = "Register";
        WebElement actualMessageelement = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to page area ", expectedMessage, actualMessage);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        WebElement registerlink = driver.findElement(By.linkText("Register"));
        registerlink.click();

        WebElement radiobuttontab = driver.findElement(By.id("gender"));
        radiobuttontab.click();

        WebElement gendertab = driver.findElement(By.id("gender-female"));
        gendertab.click();

        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("Devanshi");

        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("Pipaliya");

        WebElement dateofbirth = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]"));
        dateofbirth.sendKeys("17");

        WebElement selectmonth= driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"));
        selectmonth.sendKeys("March");

        WebElement selectyear= driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"));
        selectyear.sendKeys("1999");

        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("devanshi17@gmail.com");

        WebElement passwordfield = driver.findElement(By.id("Password"));
        passwordfield.sendKeys("Password!");

        WebElement confirmpasswordfield = driver.findElement(By.id("ConfirmPassword"));
        confirmpasswordfield.sendKeys("Password!");

        WebElement registerbutton = driver.findElement(By.xpath("//button[@id='register-button']"));
        registerbutton.click();

        String expectedMessage = "Your registration completed";
        WebElement actualMessageelement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to page area ", expectedMessage, actualMessage);


    }

}
