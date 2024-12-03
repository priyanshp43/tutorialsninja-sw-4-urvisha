package index.php.demo.com.tutorialsninja.pages;

import index.php.demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ProductDetailsPage extends Utility {

    By pageTitle = By.xpath("(//h1)[2]");
    By dateButton = By.xpath("//div[@class = 'input-group date']//button");
    By monthAndYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By nextButton = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By allDates = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    By quantity = By.name("quantity");
    By btnAddCart = By.xpath("//button[@id='button-cart']");
    By productAddMsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCart = By.linkText("shopping cart");
    //By shoppingCart = By.linkText("shopping cart");
    public String getPageTitle(){
        return getTextFromElement(pageTitle);
    }
    public void selectDeliveryDate(String year, String month, String date){
        selectDateFromDatePicker(year, month, date, dateButton, monthAndYear, nextButton, allDates);
    }



    public void enterQuantity(String quantity1){
        sendTextToElement(quantity, quantity1 );
    }
    public void clickOnAddToCartButton(){
        clickOnElement(btnAddCart);
    }
    public String getProductAddToCartSuccessMessage(){
        // return waitUntilVisibilityOfElementLocated(productAddMsg, 5).getText();
        return getTextFromElement(productAddMsg);
    }
    public void clickOnShoppingCartLink(){
        // clickOnElement(waitUntilVisibilityOfElementLocated(shoppingCart ,2));
        //clickOnElement(shoppingCart);
        mouseHoverToElementAndClick(shoppingCart);
    }
}
