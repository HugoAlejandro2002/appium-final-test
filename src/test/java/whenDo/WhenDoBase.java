package whenDo;

import activities.whendo.DeleteProjectPopUp;
import activities.whendo.EditListPage;
import activities.whendo.TaskFormsPage;
import activities.whendo.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class WhenDoBase {
    TaskFormsPage taskFormsPage = new TaskFormsPage();
    MainPage mainPage = new MainPage();
    DeleteProjectPopUp deleteProjectPopUp = new DeleteProjectPopUp();
    EditListPage editListPage = new EditListPage();


    @BeforeEach
    public void before(){}

    @AfterEach
    public void after(){
        Session.getInstance().closeApp();
    }
}
