package alarmSuiteTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateAlarm extends AlarmTestBase{
    @Test
    public void createAlarmAt4_16PM() throws InterruptedException {

        homePage.alarmButton.click();
        alarmPage.addAlarmButton.click();

        alarmPage.hoursField.click();
        Thread.sleep(500);

        alarmPage.selectHour.click();
        Thread.sleep(2000);

        alarmPage.minutesField.click();
        Thread.sleep(1000);


        alarmPage.selectMinutes.click();
        Thread.sleep(500);


        alarmPage.selectPM.click();
        Thread.sleep(500);


//        alarmPage.acceptAlarm.click();
        Thread.sleep(500);

        Assertions.assertTrue(alarmPage.newAlarmLabel.isDisplayed(), "La alarma de las 4:16 PM no se creó correctamente.");

    }
}
