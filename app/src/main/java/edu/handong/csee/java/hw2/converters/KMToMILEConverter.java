package edu.handong.csee.java.hw2.converters;
/**
 * This is a class of KMtoMILEConverter which converts KM to MILE
 */
public class KMToMILEConverter implements Convertible {
    private double km;
    private double mile;

    /**
     * This is a method setFromValue to set km from a given parameter - double fromValue
     */
    public void setFromValue(double fromValue){
        km = fromValue;
    }

    /**
     * This is a method convert which sets mile based on the conversion of km to mile
     */
    public void convert(){
        mile = km / 1.6;
    }

    /**
     * This is a method getConvertedValue which returns the converted value - double mile
     */
    public double getConvertedValue(){
        return mile; 
    }
}
