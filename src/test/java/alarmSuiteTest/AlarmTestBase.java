package alarmSuiteTest;

import activities.alarm.AlarmPage;
import activities.alarm.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class AlarmTestBase {
    HomePage homePage = new HomePage();
    AlarmPage alarmPage = new AlarmPage();

    @BeforeEach
    public void before(){}

    @AfterEach
    public void after(){
        Session.getInstance().closeApp();
    }
}
