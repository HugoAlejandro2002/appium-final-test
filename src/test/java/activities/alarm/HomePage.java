package activities.alarm;

import controls.Button;
import org.openqa.selenium.By;

public class HomePage {
    public Button alarmButton = new Button(By.xpath("//android.widget.TextView[@text=\"ALARM\"]"));
}
