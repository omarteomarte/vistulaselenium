package org.vistula.selenium.test.workhomemarcin;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPageData {
    private WebDriver driver;

    public ResultPageData(WebDriver driver) {
        this.driver = driver;
    }

    public void urlEquals (String url) {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, url );
    }

    public void urlNotEquals(String url) {
        String URL = driver.getCurrentUrl();
        Assert.assertNotEquals(URL, url );
    }

}
