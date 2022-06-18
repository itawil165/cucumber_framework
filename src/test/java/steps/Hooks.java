package steps;

import cucumber.api.java.After;
import utilites.Driver;

public class Hooks {

    @After
    public void teardown() {
        Driver.quitDriver();
    }
}
