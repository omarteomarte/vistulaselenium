package org.vistula.selenium.test.workhomemarcin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arena {
    private WebDriver driver;

    @FindBy(className = "button_link")
    private WebElement projectButton;
    @FindBy(id= "name")
    private WebElement name;
    @FindBy(id= "prefix")
    private WebElement prefix;
    @FindBy (id= "save")
    private WebElement save;
    @FindBy (className = "activeMenu")
    private WebElement allProjects;
    @FindBy (id = "search")
    private WebElement search;
    @FindBy (id = "j_searchButton")
    private WebElement searchButton;
    @FindBy (className = "t_number")
    private WebElement searchResultPrefix;
    @FindBy(id="email")
    private WebElement email;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id="login")
    private WebElement login;
    @FindBy(className = "header_admin")
    private WebElement adminPanel;

    public Arena(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logIn(String log, String pass) {
        email.sendKeys(log);
        password.sendKeys(pass);
        login.click();
    }
    public void goToAdmPanel() {
        adminPanel.click();
    }
    public String findResult() {
        return searchResultPrefix.getText();
    }
    public void newProject(String n, String p) {
        projectButton.click();
        name.sendKeys(n);
        prefix.sendKeys(p);
        save.click();
    }
    public void goToProjects(){
        allProjects.click ();
    }
    public void findMyProject(String pr) {
        search.sendKeys(pr);
        searchButton.click();
    }
}