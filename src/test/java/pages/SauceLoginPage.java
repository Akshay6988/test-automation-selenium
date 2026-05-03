package pages;

import base.BasePage;
import org.openqa.selenium.*;

public class SauceLoginPage extends BasePage {
    private By user = By.id("user-name");
    private By password = By.id("password");
    private By login = By.id("login-button");

    public SauceLoginPage(WebDriver driver){
        super(driver);
    }

    public void open(String url) { super.open(url); }

    public void login(String u, String p){
        sendValue(user, u);
        sendValue(password, p);
        click(login);
    }
}