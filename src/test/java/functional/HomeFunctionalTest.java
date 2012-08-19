package functional;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HomeFunctionalTest {

    @Test
    public void shouldShowTryMeLink() throws Exception {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("http://localhost:9876/twu");
        WebElement link = webDriver.findElement(By.tagName("a"));

        assertThat( link.getText(), is("Try me"));

        webDriver.close();
    }

}
