package com.espn.data;
import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name="logindata")
    public Object[][] getLoginData(){
        Object[][] data={{"dhfhff","jdjdjd"}};
        return data;
    }
}
}
