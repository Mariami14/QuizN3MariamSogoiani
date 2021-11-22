import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import org.testng.asserts.SoftAssert;

public class SelenideBasics2Test {

    @Test
    public void firstTest() {
        open("https://demoqa.com/books");

        $$(".rt-tr-group").
                filterBy(Condition.and("Name", Condition.text("O'Reilly Media"), Condition.text("Javascript"))).
                shouldHave(size(10));
    }

}