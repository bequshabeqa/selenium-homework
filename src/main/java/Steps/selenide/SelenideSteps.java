package Steps.selenide;

import Elements.selenide.AuthorizationElements;

import java.util.concurrent.locks.Condition;

public class SelenideSteps extends AuthorizationElements {

    public void actions(){
        searchInput.click();
        searchInput.doubleClick();
        searchInput.clear();
        searchInput.sendKeys();
        searchInput.setValue("");
        searchInput.selectOption(1);
        searchInput.download();
        searchInput.hover();

    }

//    public void checks(){
//        searchInput.shouldBe(Condition.visible);
//        searchInput.shouldHave(Condition.exactText(""));
//        searchInput.shouldNotBe(Condition.disabled);
//        searchInput.shouldNotBe(Condition.appear);
//        searchInput.shouldHave(Condition.name(""));
//        searchInput.should(Condition.visible.or(Condition.disabled));
//    }
}
