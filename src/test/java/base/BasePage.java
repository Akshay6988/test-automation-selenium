package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected  WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected WebElement el(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void sendValue(By by, String text){
        WebElement e = el(by);
        e.clear();
        e.sendKeys(text);
    }

    public void open(String url){
        driver.get(url);
    }
}
