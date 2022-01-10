package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

public class TestMainApplication {

    public void doubleAssertEquals(double expected, double actual){
        Assert.assertEquals(expected, actual, 0.001);
    }


    @Test
    public void testAdd(){

        //given
        MainApplication.display = 6.0;

        //when
        double result = MainApplication.add(1.2);

        //then

        doubleAssertEquals(7.2,result);
    }

    @Test
    public void testSubtract(){

        //given
        MainApplication.display = 4.0;

        //when
        double result = MainApplication.subtract(2.0);

        //then
        doubleAssertEquals(2.0,result);
    }

    @Test
    public void testMultiply() {

        //given
        MainApplication.display = 6.0;

        //when
        double result = MainApplication.multiply(2.0);

        //then
        doubleAssertEquals(12.0, result);
    }

    @Test
    public void testDivide() {

        //given
        MainApplication.display = 4.0;

        //when
        double result = MainApplication.divide(2.0);

        //then
        doubleAssertEquals(2.0, result);
    }

    @Test
    public void testSwitchDisplayMode() {

        //given
        MainApplication.displayMode = "decimal";

        //when
        String nextDisplayMode = MainApplication.switchDisplayMode();

        //then
        Assert.assertEquals("hexadecimal",nextDisplayMode);
    }

    @Test
    public void testDisplayMode() {

        //given
        MainApplication.displayMode = "hexadecimal";

        //when
        String nextDisplayMode = MainApplication.switchDisplayMode();

        //then
        Assert.assertEquals("binary", nextDisplayMode);
    }

    @Test
    public void switchTestDisplayMode() {

        //given
        MainApplication.displayMode = "binary";

        //when
        String nextDisplayMode = MainApplication.switchDisplayMode();

        //then
        Assert.assertEquals("octal", nextDisplayMode);
    }

    @Test
    public void testSwitchDisplayMode1() {

        //given
        MainApplication.displayMode = "octal";

        //when
        String nextDisplayMode = MainApplication.switchDisplayMode();

        //then
        Assert.assertEquals("decimal", nextDisplayMode);
    }

    @Test
    public void testSwitchDisplayMode2() {

        //given
        MainApplication.displayMode = "decimal";

        //when
        String nextDisplayMode = MainApplication.switchDisplayMode();

        //then
        Assert.assertEquals("hexadecimal", nextDisplayMode);
    }

    @Test
    public void testSwitchDisplayMode3() {

        //given
        MainApplication.displayMode = "binary";

        //when
        String nextDisplayMode = MainApplication.switchDisplayMode();

        //then
        Assert.assertEquals("octal", nextDisplayMode);
    }

    @Test
    public void switchUnitsMode() {
        MainApplication.unitsMode = "degrees";
        String nextDisplayMode = MainApplication.switchUnitsMode();
        Assert.assertEquals("radians", nextDisplayMode);
    }
}
