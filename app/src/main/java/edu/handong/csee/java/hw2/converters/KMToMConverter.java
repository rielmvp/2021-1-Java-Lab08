package edu.handong.csee.java.hw2.converters;
/**
 * This is a class of KMtoMConverter which converts KM to M
 */
public class KMToMConverter implements Convertible {
    private double km;
    private double m;

    /**
     * This is a method setFromValue to set km from a given parameter - double fromValue
     */
    public void setFromValue(double fromValue){
        km = fromValue;
    }

    /**
     * This is a method convert which sets m based on the conversion of km to m
     */
    public void convert(){
        m = km * 1000;
    }

    /**
     * This is a method getConvertedValue which returns the converted value - double m
     */
    public double getConvertedValue(){
        return m; 
    }
}
