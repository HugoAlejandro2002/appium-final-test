package activities.demoapp;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class SideBarMenu {
    public Button signInButton = new Button(By.xpath("//android.view.ViewGroup[@content-desc=\"nav-signin\"]/android.widget.Button"));
    public Button logOutButton = new Button(By.xpath("//android.view.ViewGroup[@content-desc=\"nav-logout\"]"));
}
