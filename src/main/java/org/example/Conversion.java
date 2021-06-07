package org.example;

public class Conversion extends getData{
    public double convertToF(double a){
        return (a - 32) * (5.0/9.0);
    }
    public double convertToC(double a){
        return (a * (9.0 / 5.0)) + 32;
    }
}
