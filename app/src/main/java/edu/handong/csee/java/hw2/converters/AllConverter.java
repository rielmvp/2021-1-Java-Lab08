package edu.handong.csee.java.hw2.converters;
/**
 * This is a class of AllConverter, which can convert multiple values at once
 */
public class AllConverter {
    private double value1, result1, result2;
    private String measure;

    /**
     * 
     * @param fromValue
     * @return this (to enable method chaining)
     * This is a method setFromValue to set value1 from a given parameter
     */
    public AllConverter setFromValue(double fromValue) {
        value1 = fromValue;
        return this;
    }

    /**
     * 
     * @param originalMeasure
     * @return this (to enable method chaining)
     * This is a method setOriginalMeasure to set measure from a given parameter
     */
    public AllConverter setOriginalMeasure(String originalMeasure){
        measure = originalMeasure;
        return this;
    }

    /**
     * This is a method convertAndPrintOut which checks whether value1 is a valid value, converts it to get multiple results, and prints out those results. Else if value1 is invalid, then it prints an error message.
     */
    public void convertAndPrintOut(){
        if (measure.equals("KM")) {
            result1 = value1 * 1000;    //returns miles
            result2 = value1 / 1.6;     //returns kilometers
            System.out.println(value1 + " KM to " + result1 + " M");
            System.out.println(value1 + " KM to " + result2 + " MILE");
        } else if (measure.equals("TON")) {
            result1 = value1 * 1000; //returns kilograms
            result2 = value1* 1000000;   //returns grams
            System.out.println(value1 + " TON to " + result1 + " KG");
            System.out.println(value1 + " TON to " + result2 + " G");
        } else {
            System.out.println("AllConverter cannot support the measure!");
        }
    }
}
