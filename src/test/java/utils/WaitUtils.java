package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class WaitUtils{
    public static WebElement visible(WebDriver d, By by, int sec){
        return new WebDriverWait(d, Duration.ofSeconds(sec))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void clickable(WebDriver d, By by, int sec){
        new WebDriverWait(d, Duration.ofSeconds(sec))
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void frameAndSwitch(WebDriver d, By by, int sec){
        new WebDriverWait(d, Duration.ofSeconds(sec))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }
}
