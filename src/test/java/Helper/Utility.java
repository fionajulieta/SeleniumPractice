package Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Utility {

    public static WebDriver driver = WebDriverManager.chromedriver().create();

}
