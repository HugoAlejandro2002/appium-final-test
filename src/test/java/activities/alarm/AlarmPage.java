package activities.alarm;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class AlarmPage {
    public Button addAlarmButton = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Button hoursField = new Button(By.id("android:id/hours"));
    public Button selectHour = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"4\"]"));
    public Button minutesField = new Button(By.id("android:id/minutes"));
    public Button selectMinutes = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]"));
    public Button selectPM = new Button(By.id("android:id/pm_label"));
    public Button acceptAlarm = new Button(By.id("android:id/button1"));
    public Label newAlarmLabel = new Label(By.xpath("//android.view.ViewGroup[@content-desc=\"4:15 PM Alarm\"]"));
}