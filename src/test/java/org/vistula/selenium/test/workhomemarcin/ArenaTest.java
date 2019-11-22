package org.vistula.selenium.test.workhomemarcin;

import org.junit.Assert;
import org.junit.Test;


public class ArenaTest extends DriverMain {
    @Test
    public void loginToPage () {
      Arena arena = new Arena(driver);
      arena.logIn("administrator@testarena.pl", "sumXQQ72$L");
      ResultPageData resultPageData = new ResultPageData(driver);
      resultPageData.urlEquals("http://demo.testarena.pl/");

    }
    @Test
    public void goToAdmPanel(){
        Arena arena = new Arena(driver);
        arena.logIn("administrator@testarena.pl", "sumXQQ72$L");
        arena.goToAdmPanel();
        ResultPageData resultPageData = new ResultPageData(driver);
        resultPageData.urlEquals("http://demo.testarena.pl/administration/projects");

    }
    @Test
    public void newProject () {
        Arena arena = new Arena(driver);
        arena.logIn("administrator@testarena.pl", "sumXQQ72$L");
        arena.goToAdmPanel();
        arena.newProject("122334a", "233445" );
        ResultPageData resultPageData = new ResultPageData(driver);
        resultPageData.urlNotEquals("http://demo.testarena.pl/administration/adding_project");
    }
    @Test
    public  void goToProjects (){
        Arena arena = new Arena(driver);
        arena.logIn("administrator@testarena.pl", "sumXQQ72$L");
        arena.goToAdmPanel();
        arena.goToProjects();
        ResultPageData resultPageData = new ResultPageData(driver);
        resultPageData.urlEquals("http://demo.testarena.pl/administration/projects");

    }
    @Test
    public void findProject () {
        Arena arena = new Arena(driver);
        arena.logIn("administrator@testarena.pl", "sumXQQ72$L");

        arena.goToAdmPanel();
        String projectName = "122334a";
        String projectPrefix = "233445";
        arena.newProject(projectName,projectPrefix);
        arena.goToProjects();
        arena.findMyProject(projectName);

        String searchResult = arena.findResult();
        Assert.assertEquals(projectPrefix, searchResult);

    }

}

