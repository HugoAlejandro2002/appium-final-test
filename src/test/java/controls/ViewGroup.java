package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ViewGroup extends AppiumControl{
    public ViewGroup(By locator) {
        super(locator);
    }
    public String findContentOfChildByXpath(String xPath){
        findControl();
        return control.findElement(By.xpath(xPath)).getAttribute("text");
    }
}
