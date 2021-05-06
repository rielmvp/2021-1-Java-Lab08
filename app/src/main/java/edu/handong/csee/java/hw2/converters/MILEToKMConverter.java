package edu.handong.csee.java.hw2.converters;
/**
 * This is a class of MILEtoKMConverter which converts MILE to KM
 */
public class MILEToKMConverter implements Convertible {
    private double mile;
    private double km;

    /**
     * This is a method setFromValue to set mile from a given parameter - double fromValue
     */
    public void setFromValue(double fromValue){
        mile = fromValue;
    }

    /**
     * This is a method convert which sets km based on the conversion of mile to km
     */
    public void convert(){
        km = mile * 1.6;
    }

    /**
     * This is a method getConvertedValue which returns the converted value - double km
     */
    public double getConvertedValue(){
        return km; 
    }
}
