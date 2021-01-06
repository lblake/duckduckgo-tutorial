package searchtutorial.duckduckgo;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import searchtutorial.duckduckgo.steps.DuckDuckGoSearcher;

@RunWith(SerenityRunner.class)
public class WhenSearchingByKeywordInDuckDuckGo {

    @Steps
    DuckDuckGoSearcher lloyd;

    @Test
    public void should_see_relevant_search_results() {


        lloyd.searches_by_keyword_for("Cucumber Recipes");

        lloyd.should_see_only_results_containing("Cucumber");


    }
}
