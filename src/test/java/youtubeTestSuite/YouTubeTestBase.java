package youtubeTestSuite;

import activities.youtube.MainPage;
import activities.youtube.ResultsSearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class YouTubeTestBase {
    MainPage mainPage = new MainPage();
    ResultsSearchPage resultsSearchPage = new ResultsSearchPage();

    @BeforeEach
    public void before(){}

    @AfterEach
    public void after(){
        Session.getInstance().closeApp();
    }
}
