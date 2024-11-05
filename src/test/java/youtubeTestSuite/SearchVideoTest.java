package youtubeTestSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchVideoTest extends YouTubeTestBase{
    @Test
    public void searchVideosSuccessfully(){
        mainPage.allowButton.click();
        mainPage.searchButton.click();
        resultsSearchPage.searchTextBox.setText("one direction steal my girl");
        resultsSearchPage.firstResultButton.click();
        Assertions.assertTrue(resultsSearchPage.resultOfSearch.isControlDisplayed(), "ERROR! The search was not successfully");
    }
}
