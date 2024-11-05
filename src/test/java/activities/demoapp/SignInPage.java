package activities.demoapp;

import controls.Button;
import org.openqa.selenium.By;

public class SignInPage {
    public Button usernameButton = new Button(By.xpath("//android.widget.Spinner[@content-desc=\"username-input\"]"));
    public Button demouserButton = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"demouser\"]"));
    public Button passwordButton = new Button(By.xpath("//android.widget.Spinner[@content-desc=\"password-input\"]"));
    public Button testingPassword = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"testingisfun99\"]"));
    public Button sigInButton = new Button(By.xpath("//android.view.ViewGroup[@content-desc=\"login-btn\"]"));


}
