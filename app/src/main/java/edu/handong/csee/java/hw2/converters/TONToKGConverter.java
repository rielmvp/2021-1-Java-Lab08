package edu.handong.csee.java.hw2.converters;
/**
 * This is a class of TONtoKGConverter which converts TON to KG
 */
public class TONToKGConverter implements Convertible {
    private double ton;
    private double kg;

    /**
     * This is a method setFromValue to set ton from a given parameter - double fromValue
     */
    public void setFromValue(double fromValue){
        ton = fromValue;
    }

    /**
     * This is a method convert which sets kg based on the conversion of ton to kg
     */
    public void convert(){
        kg = ton * 1000;
    }

    /**
     * This is a method getConvertedValue which returns the converted value - double kg
     */
    public double getConvertedValue(){
        return kg; 
    }
}
