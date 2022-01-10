package com.zipcodewilmington.scientific_calculator;

import com.sun.tools.javadoc.Main;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication2{
    @Test
    public void currentNumberTest() {
        MainApplication.changeNumber(0);
        Assert.assertEquals(0, MainApplication.display,0);
    }
    //clear is not easily testable as it deals with string functionality
    @Test
    public void changeNumberTest() {
        MainApplication.changeNumber(22);
        Assert.assertEquals(22, MainApplication.display,0);
    }

    @Test
    public void addTest() {
        MainApplication.changeNumber(1);
        Assert.assertEquals(2,MainApplication.add(1d),0);
    }
    @Test
    public void subtractTest() {
        MainApplication.changeNumber(1);
        Assert.assertEquals(0,MainApplication.subtract(1d),0);
    }
    @Test
    public void multiplyTest() {
        MainApplication.changeNumber(2);
        Assert.assertEquals(4,MainApplication.multiply(2d),0);
    }
    @Test
    public void divideTest() {
        MainApplication.changeNumber(4);
        Assert.assertEquals(2,MainApplication.divide(2d),0);
    }
    @Test
    public void squareTest() {
        Assert.assertEquals(4,MainApplication.square(2),0);
    }
    @Test
    public void squareRootTest() {
        Assert.assertEquals(2,MainApplication.sqrt(4),0);
    }
    @Test
    public void variableExponentTest() {
        Assert.assertEquals(27,MainApplication.varexpo(3,3),0);
    }
    @Test
    public void inverseTest() {
        Assert.assertEquals(0.5,MainApplication.inverse(2),1);
    }
    @Test
    public void negateTest() {
        Assert.assertEquals(-1,MainApplication.negate(1),0);
    }
    @Test
    public void switchDisplayModeTest() {
        //if you start at decimal the next mode should be hexadecimal
        MainApplication.switchDisplayMode("decimal");
        MainApplication.switchDisplayMode();
        Assert.assertEquals("hexadecimal",MainApplication.displayMode);
    }
    @Test
    public void binaryTest() {
        MainApplication.switchDisplayMode("binary");
        Assert.assertEquals("binary",MainApplication.displayMode);
    }
    @Test
    public void decimalTest() {
        MainApplication.switchDisplayMode("decimal");
        Assert.assertEquals("decimal",MainApplication.displayMode);
    }
    @Test
    public void octalTest() {
        MainApplication.switchDisplayMode("octal");
        Assert.assertEquals("octal",MainApplication.displayMode);
    }
    @Test
    public void hexadecimalTest() {
        MainApplication.switchDisplayMode("hexadecimal");
        Assert.assertEquals("hexadecimal",MainApplication.displayMode);
    }
    @Test
    public void addToMemoryTest() {
        MainApplication.memorize(2);
        Assert.assertEquals(2,MainApplication.memory,0);
    }
    @Test
    public void clearMemoryTest() {
        MainApplication.clearMemory();
        Assert.assertEquals(0,MainApplication.memory,0);
    }
    //recallMemory is basically just calling MainApplication.memory which we've already tested
    @Test
    //radians
    public void sineTest() {
        MainApplication.switchUnitsMode("radians");
        Assert.assertEquals(0,MainApplication.sin(0),0);
    }
    @Test
    public void cosineTest() {
        MainApplication.switchUnitsMode("radians");
        Assert.assertEquals(-1,MainApplication.cos(Math.PI),0);
    }
    @Test
    public void tangentTest() {
        MainApplication.switchUnitsMode("radians");
        Assert.assertEquals(0,MainApplication.tan(0),0);
    }
    @Test
    public void inverseSineTest() {
        MainApplication.switchUnitsMode("degrees");
        Assert.assertEquals(2, MainApplication.invSin(30),0);
    }
    @Test
    public void inverseCosineTest() {
        MainApplication.switchUnitsMode("degrees");
        Assert.assertEquals(2, MainApplication.invCos(60),0);
    }
    @Test
    public void inverseTangentTest() {
        MainApplication.switchUnitsMode("degrees");
        Assert.assertEquals(0.57, MainApplication.invTan(30),2);
    }
    @Test
    public void switchUnitsModeTest() {
        //if it starts with degrees then this must switch units to radians
        MainApplication.switchUnitsMode("degrees");
        MainApplication.switchUnitsMode();
        Assert.assertEquals("radians",MainApplication.unitsMode);
    }
    @Test
    public void degreesTest() {
        MainApplication.switchUnitsMode("degrees");
        Assert.assertEquals("degrees",MainApplication.unitsMode);
    }
    @Test
    public void radiansTest() {
        MainApplication.switchUnitsMode("radians");
        Assert.assertEquals("radians",MainApplication.unitsMode);
    }
    @Test
    public void logTest() {
        Assert.assertEquals(0,MainApplication.log(1),0);
    }
    @Test
    public void inverseLogTest() {
        Assert.assertEquals(100,MainApplication.invLog(2),0);
    }
    @Test
    public void naturalLogTest() {
        Assert.assertEquals(.69,MainApplication.ln(2),2);
    }
    @Test
    public void inverseNaturalLogTest() {
        Assert.assertEquals(2.718,MainApplication.invLn(1),3);
    }
    @Test
    public void factorialTest() {
        Assert.assertEquals(120, MainApplication.factorial(5),0);
    }
    @Test
    public void absoluteValueTest() {
        Assert.assertEquals(1, MainApplication.abs(-1),0);
    }

}
