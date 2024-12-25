package Steps.selenium;

import Elements.selenium.WaitTestElement;
import org.openqa.selenium.By;

import static Utils.selenium.SetUpClass.findElement;

public class WaitTestSteps extends WaitTestElement {

    public void StartButton() {

        findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
    }
    public void check() {

        findElement(By.xpath("//*[@id=\"resetButton\"]"));
    }
}
