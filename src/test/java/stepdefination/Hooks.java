package stepdefination;

import cucumber.api.java.After;
import utilities.Driver;

public class Hooks {

    @After
    public void after(){

        Driver.QuitDriver();

    }

}