package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        WebElement computertab = driver.findElement(By.linkText("Computers"));
        computertab.click();

        String expectedMessage = "Computers";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals("navigate to computer area ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement eletronicstab = driver.findElement(By.linkText("Electronics"));
        eletronicstab.click();

        String expectedMessage = "Electronics";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = actualMessageelement.getText();

        Assert.assertEquals(" navigate to electornic tab", expectedMessage, actualMessage);


    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement appareltab = driver.findElement(By.linkText("Apparel"));
        appareltab.click();

        String expectedMessage = "Apparel";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to apparel tab", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement digitaldownloadstab = driver.findElement(By.linkText("Digital downloads"));
        digitaldownloadstab.click();

        String expectedMessage = "Digital downloads";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to digital downloads tab", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement bookstab = driver.findElement(By.linkText("Books"));
        bookstab.click();

        String expectedMessage = "Books";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to books tab", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelerytab = driver.findElement(By.linkText("Jewelry"));
        jewelerytab.click();

        String expectedMessage = "Jewelry";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to jewelry tab", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement gift_cardstab = driver.findElement(By.linkText("Gift Cards"));
        gift_cardstab.click();

        String expectedMessage = "Gift Cards";
        WebElement actualMessageelement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = actualMessageelement.getText();
        Assert.assertEquals(" navigate to gift cards tab", expectedMessage, actualMessage);
    }


}
