package index.php.demo.com.tutorialsninja.pages;

import index.php.demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {

    By myAccountPageTile = By.xpath("//h2[normalize-space()='My Account']");
    public String getMyAccountPageTitle(){
        return getTextFromElement(myAccountPageTile);
    }
}
