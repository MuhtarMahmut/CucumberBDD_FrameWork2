package Pages;

import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleElemnts extends TestBase {

    public GoogleElemnts(){
        PageFactory.initElements(driver, this);
    }

//       public        static         void            method      ( String AA  ){     }
// accessModif        specifier      returnType      methodname     parameter

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement searchbox;


}
