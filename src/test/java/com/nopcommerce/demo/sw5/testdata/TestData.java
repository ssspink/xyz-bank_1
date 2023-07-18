package com.nopcommerce.demo.sw5.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "Register details")
    public Object[][] getData(){
        Object[][]data = new Object[][]{
                {"Harry","VD", "United Kingdom", "London", "Union Hall" , "HA0 4SE", "07432654896"},

        };
        return data;}

}
