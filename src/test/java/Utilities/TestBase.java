package Utilities;


import Pages.GoogleElemnts;
import Pages.WebElemnts2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions act;

    public static GoogleElemnts google;
    public static WebElemnts2 ele;




}
