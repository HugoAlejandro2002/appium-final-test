package activities.youtube;

import controls.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button allowButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"));
    public Button searchButton = new Button(By.xpath("//android.view.ViewGroup[@content-desc=\"Search YouTube\"]"));
}
