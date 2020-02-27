package com.HMehrzad.Learning;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        //
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        //
        int myIntValue = 5 / 3;
        //float myFloatValue = (float) 5.25;
        //float myFloatValue = 5.25f;
        //double myDoubleValue = 5.25d;
        float myFloatValue = 5f / 3f;
        //double myDoubleValue = 5d / 3d;
        double myDoubleValue = 5.00d / 3.00d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println(" MyDoubleValue= " + myDoubleValue);
        // Convert a given number of pounds to kilograms
        double numberOfPounds = 200;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);
        // Another Example
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}