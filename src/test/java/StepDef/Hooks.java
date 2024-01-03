package StepDef;

import Helper.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {

    @Before
    public void beforeTest() {
        System.out.println("Start of scenario");

    }

    @After
    public void afterTest() throws InterruptedException {
        System.out.println("End of scenario");
        Thread.sleep(2000);
//        driver.close();
    }

}
