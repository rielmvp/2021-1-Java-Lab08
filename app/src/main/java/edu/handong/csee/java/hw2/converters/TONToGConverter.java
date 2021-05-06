package edu.handong.csee.java.hw2.converters;
/**
 * This is a class of TONtoGConverter which converts TON to G
 */
public class TONToGConverter implements Convertible {
    private double ton;
    private double g;

    /**
     * This is a method setFromValue to set ton from a given parameter - double fromValue
     */
    public void setFromValue(double fromValue){
        ton = fromValue;
    }

    /**
     * This is a method convert which sets g based on the conversion of ton to g
     */
    public void convert(){
        g = ton * 1000000;
    }

    /**
     * This is a method getConvertedValue which returns the converted value - double g
     */
    public double getConvertedValue(){
        return g; 
    }
}
