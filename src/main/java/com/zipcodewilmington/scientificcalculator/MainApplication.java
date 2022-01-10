package com.zipcodewilmington.scientificcalculator;

import java.util.Locale;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static double display = 0; //ie current number
    public static String unitsMode = "degrees";
    public static String displayMode = "decimal";
    public static double memory = 0;
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //THINGS TO ADD STILL: EXCEPTION/ERROR HANDLING FORCING A CLEAR;
        String s = "";
        while(!(s.equals("kill"))){
            s = Console.getStringInput("What do you want to do?");
            switch (s.toLowerCase()) {
                case "current number":
                    Console.println(String.format("The current number is: %s",displayPrint(display)));
                    break;
                case "clear screen":
                    clearScreen();
                    break;
                case "change current number":
                    changeNumber(Console.getDoubleInput("Give me a new current number"));
                    String changeCurStr = String.format("The new number is %s.",displayPrint(display));
                    Console.println(changeCurStr);
                    break;
                case "add":
                    double adder = Console.getDoubleInput("Give me the number to add to the display");
                    String addStr = String.format("The sum of %s and %s is %s.",displayPrint(display),displayPrint(adder),displayPrint(add(adder)));
                    Console.println(addStr);
                    break;
                case "subtract":
                    double subber = Console.getDoubleInput("Give me the number to subtract from the display");
                    String subStr = String.format("The difference of %s and %s is %s.",displayPrint(display),displayPrint(subber),displayPrint(subtract(subber)));
                    Console.println(subStr);
                    break;
                case "multiply":
                    double multer = Console.getDoubleInput("Give me the number to multiply the display by");
                    String mulStr = String.format("The product of %s and %s is %s.",displayPrint(display),displayPrint(multer),displayPrint(multiply(multer)));
                    Console.println(mulStr);
                    break;
                case "divide":
                    //perfect spot for error testing
                    double divver = Console.getDoubleInput("Give me the number to divide the display by");
                    String divStr = String.format("The quotient of %s and %s is %s.",displayPrint(display),displayPrint(divver),displayPrint(divide(divver)));
                    Console.println(divStr);
                    break;
                case "square":
                    Console.println(String.format("The square of %s is %s.",displayPrint(display),displayPrint(square(display))));
                    break;
                case "square root":
                    Console.println(String.format("The square root of %s is %s.",displayPrint(display),displayPrint(sqrt(display))));
                    break;
                case "variable exponent":
                    double exponent = Console.getDoubleInput("What power should I raise the display to?");
                    Console.println(String.format("%s to the %sth power is %s",displayPrint(display),displayPrint(exponent),displayPrint(varexpo(display,exponent))));
                    break;
                case "inverse":
                    String invstr = String.format("The inverse of %s is %s",displayPrint(display), displayPrint(inverse(display)));
                    Console.println(invstr);
                    break;
                case "negate":
                    String negstr = String.format("The display number of %s has been negated to %s ",displayPrint(display),displayPrint(negate(display)));
                    Console.println(negstr);
                    break;
                case "switch display mode":
                    String switchdispstr = String.format("The display mode is now: %s",switchDisplayMode());
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    Console.println(switchdispstr);
                    break;
                case "binary":
                    String binstr = String.format("The display mode is now: %s",switchDisplayMode("binary"));
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    Console.println(binstr);
                    break;
                case "decimal":
                    String decistr = String.format("The display mode is now: %s",switchDisplayMode("decimal"));
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    Console.println(decistr);
                    break;
                case "octal":
                    String octalstr = String.format("The display mode is now: %s",switchDisplayMode("octal"));
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    Console.println(octalstr);
                    break;
                case "hexadecimal":
                    String hexstr = String.format("The display mode is now: %s",switchDisplayMode("hexadecimal"));
                    Console.println("Loss of data is possible if you switch display modes, input data must be decimal");
                    Console.println(hexstr);
                    break;
                case "add to memory":
                    memorize(Console.getDoubleInput("Give me the number to memorize"));
                    String addmemstr = String.format("The new memorized number is %s.",displayPrint(memory));
                    Console.println(addmemstr);
                    break;
                case "clear memory":
                    clearMemory();
                    Console.println("Memory has been cleared");
                    break;
                case "recall memory":
                    String recallstr = String.format("The memorized number is %s.",displayPrint(memory));
                    Console.println(recallstr);
                    break;
                case "sin":
                    String sinstr = String.format("The sine of %s is %s", displayPrint(display),displayPrint(sin(display)));
                    Console.println(sinstr);
                    break;
                case "cos":
                    String cosstr = String.format("The cosine of %s is %s", displayPrint(display),displayPrint(cos(display)));
                    Console.println(cosstr);
                    break;
                case "tan":
                    String tanstr = String.format("The tangent of %s is %s", displayPrint(display),displayPrint(tan(display)));
                    Console.println(tanstr);
                    break;
                case "inv sin":
                    String cscstr = String.format("The inverse sine of %s is %s", displayPrint(display),displayPrint(invSin(display)));
                    Console.println(cscstr);
                    break;
                case "inv cos":
                    String secstr = String.format("The inverse cosine of %s is %s", displayPrint(display),displayPrint(invCos(display)));
                    Console.println(secstr);
                    break;
                case "inv tan":
                    String cotstr = String.format("The inverse tangent of %s is %s", displayPrint(display),displayPrint(invTan(display)));
                    Console.println(cotstr);
                    break;
                case "switch units mode":
                    String switchunitstr = String.format("The units mode is now: %s",switchUnitsMode());
                    Console.println(switchunitstr);
                    break;
                case "radians":
                    String radstr = String.format("The units mode is now: %s",switchUnitsMode("radians"));
                    Console.println(radstr);
                    break;
                case "degrees":
                    String degstr = String.format("The units mode is now: %s",switchUnitsMode("degrees"));
                    Console.println(degstr);
                    break;
                case "log":
                    String logstr = String.format("The log of %s is %s.",displayPrint(display),displayPrint(log(display)));
                    Console.println(logstr);
                    break;
                case "inv log":
                    String invlogstr = String.format("The inv log of %s is %s.",displayPrint(display),displayPrint(invLog(display)));
                    Console.println(invlogstr);
                    break;
                case "ln":
                    String lnstr = String.format("The natural log of %s is %s.",displayPrint(display),displayPrint(ln(display)));
                    Console.println(lnstr);
                    break;
                case "inv ln":
                    String invlnstr = String.format("The inv natural log of %s is %s.",displayPrint(display),displayPrint(invLn(display)));
                    Console.println(invlnstr);
                    break;
                case "factorial":
                    String facstr = String.format("The factorial of %s is %s.",displayPrint(display),displayPrint(factorial(display)));
                    Console.println(facstr);
                    break;
                    //extra function #1
                case "absolute value":
                    String absstr = String.format("The square of %s is %s.",displayPrint(display),displayPrint(abs(display)));
                    Console.println(absstr);
                    break;
                    //extra function #2
                case "kill":
                    Console.println("The calculator will now exit...");
                    break;
                default:
                    Console.println("Cannot compute. Please try again");
                    break;
            }
        }
    }
    //I have no idea if this will work or not
    public static void clearScreen() {
        try{
            Runtime.getRuntime().exec("clear");
        }
        catch (final Exception e){
            System.exit(1);
        }
    }
    public static double changeNumber(double newNum){
        return display = newNum;
    }
    public static double memorize(double newNum){
        return memory = newNum;
    }
    public static void clearMemory(){
        memory = 0;
    }
    public static double add(double adder){
        return display + adder;
    }
    public static double subtract(double subber){
        return display - subber;
    }
    public static double multiply(double multer){
        return display * multer;
    }
    public static double divide(double divver){
        return display / divver;
    }
    public static double square(double squarer){ return squarer * squarer;}
    public static double sqrt(double sqrter){return Math.sqrt(sqrter);}
    public static double varexpo(double one, double two){return Math.pow(one,two);}
    public static float inverse(double inverser){return (float)(1/inverser);}
    public static double negate(double negater){return negater * -1;}
    public static double sin(double sinner){return Math.sin(unitter(sinner));}
    public static double cos(double cosser){return Math.cos(unitter(cosser));}
    public static double tan(double tanner){return Math.tan(unitter(tanner));}
    public static float invSin(double invsin){return (float)  (1 / sin(invsin));}
    public static float invCos(double invcos){return (float) (1 / cos(invcos));}
    public static float invTan(double invtan){return (float) (1 / tan(invtan));}
    public static double log(double logger){return Math.log10(logger);}
    public static double invLog(double invlog){return Math.pow(10,invlog);}
    public static double ln(double lner){return Math.log(lner);}
    public static double invLn(double invln){return Math.exp(invln);}
    public static double abs(double abser){return Math.abs(abser);}
    public static String switchDisplayMode(){
        switch(displayMode){
            case "decimal":
                displayMode = "hexadecimal";
                return displayMode;
            case "hexadecimal":
                displayMode = "binary";
                return displayMode;
            case "binary":
                displayMode = "octal";
                return displayMode;
            case "octal":
                displayMode = "decimal";
                return displayMode;
            default:
                displayMode = "This should never be returned";
                return displayMode;
        }
    }
    public static String switchDisplayMode(String mode){
        switch(mode){
            case "decimal":
                displayMode = "decimal";
                return displayMode;
            case "hexadecimal":
                displayMode = "hexadecimal";
                return displayMode;
            case "binary":
                displayMode = "binary";
                return displayMode;
            case "octal":
                displayMode = "octal";
                return displayMode;
            default:
                displayMode = "This should never be returned";
                return displayMode;
        }
    }
    /**
    public static String displayPrint(int original){
        switch(displayMode){
            case "decimal":
                return Integer.valueOf(original).toString();
            case "hexadecimal":
                return Integer.toHexString(original);
            case "binary":
                return Integer.toBinaryString(original);
            case "octal":
                return Integer.toOctalString(original);
    }
     */
    public static String displayPrint(float original){
        int binoct = Math.toIntExact(Float.valueOf(original).longValue());
        switch(displayMode){
            case "decimal":
                return Float.valueOf(original).toString();
            case "hexadecimal":
                return Float.toHexString(original);
            case "binary":
                return Integer.toBinaryString(binoct);
            case "octal":
                return Integer.toOctalString(binoct);
            default:
                return "This should never be returned";
        }
    }
    public static String displayPrint(double original){
        //LOSS OF DATA IS POSSIBLE HERE
        int binoct = Math.toIntExact(Double.valueOf(original).longValue());
        switch(displayMode){
            case "decimal":
                return Double.valueOf(original).toString();
            case "hexadecimal":
                return Double.toHexString(original);
            case "binary":
                return Integer.toBinaryString(binoct);
            case "octal":
                return Integer.toOctalString(binoct);
            default:
                return "This should never be returned";
        }
    }
    public static double unitter(double angle) {
        if(unitsMode.equals("degrees")){
            return Math.toRadians(angle);
        }
        else{
            return angle;
        }
    }
    public static String switchUnitsMode(){
        if(unitsMode.equals("degrees")){
            unitsMode = "radians";
            return unitsMode;
        }
        else if (unitsMode.equals("radians")){
            unitsMode = "degrees";
        }
        return unitsMode;
    }

    public static String switchUnitsMode(String mode){
        if(mode.equals("degrees")){
            unitsMode = "degrees";
        }
        else if (mode.equals("radians")){
            unitsMode = "radians";
        }
        return unitsMode;
    }
    //not sure what a factorial function would take as parameter(s)
    public static double factorial(double factorialer){
        double factoria = 1;
        for(int i = 1; i <= factorialer;i++){
            factoria = factoria * i;
        }
        return factoria;
    }
}
