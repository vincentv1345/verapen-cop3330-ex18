package org.example;
import java.util.Scanner;
public class getData {
    Scanner d = new Scanner(System.in);
    public String getType()
    {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        return d.next();
    }
    public int getNumber()
    {
        return d.nextInt();
    }
}
