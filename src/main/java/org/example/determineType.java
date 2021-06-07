package org.example;

public class determineType extends Conversion{
    public void type(String type){
        Conversion temp = new Conversion();
        if(type.equalsIgnoreCase("C")){
            System.out.println("Your choice is C");
            System.out.println("Please enter the temperature in fahrenheit: ");
            double c = temp.getNumber();
            double celsius = temp.convertToC(c);
            System.out.println("The temperature in Celsius is " + celsius);
        }
        else if(type.equalsIgnoreCase("F")){
            System.out.print("Your choice is F");
            System.out.print("\nPlease enter the temperature in celsius: ");
            double f = temp.getNumber();
            double fahrenheit = temp.convertToF(f);
            System.out.println("\nThe temperature in fahrenheit is " + fahrenheit);
        }
        else
        {
            System.out.println("That is not an option");
        }
    }
}
