package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil{
    public static void dragAndDrop(WebDriver d, WebElement src, WebElement dest){
        new Actions(d).dragAndDrop(src, dest).perform();
    }
}