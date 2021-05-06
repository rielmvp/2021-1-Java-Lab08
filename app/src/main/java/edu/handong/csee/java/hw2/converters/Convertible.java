package edu.handong.csee.java.hw2.converters;
/**
 * This is an interface Convertible which must be implemented by the converter classes
 */
public interface Convertible {
    /**
     * 
     * @param fromValue
     * This is a method setFromValue which takes in a parameter of double fromValue and returns void
     */
    public void setFromValue(double fromValue);
    /**
     * This is a method getConvertedValue which returns a double value
     * @return double
     */
    public double getConvertedValue();
    /**
     * This is a method convert which makes a conversion and returns void
     */
    public void convert();

}