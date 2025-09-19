package edu.hawaii.ics111.h04;

import java.util.Scanner;

/**
 * A Conversion program in java
 *
 * @author CT Reatherford
 *
 */
public class Conversion
{
  /**
   * TODO: Receives input from user finish these comments
   *
   * @param args          Not used 
   *
   */ 
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);


    System.out.println("Which conversion do you want to perform? (type in \"1\" or \"2\")");
    System.out.println("1: US to Metric");
    System.out.println("2: Metric to US");
    
    int choiceConvert = input.nextInt();
    input.nextLine();
    
    if (choiceConvert == 1)
    {
      System.out.println("Which type of measurement do you want to perform? (type in \"1\", \"2\", \"3\", or \"4\")");
      System.out.println("1. Length");
      System.out.println("2. Fluid Volume");
      System.out.println("3. Mass");
      System.out.println("4. Temperature");
  
      int typeMeasure = input.nextInt();
      input.nextLine();
      
        switch (typeMeasure)
        {
          case 1:
            System.out.println("Which length do you want to convert? (type in \"1\", \"2\", or \"3\")");
            System.out.println("1. Inches to Centimeters");
            System.out.println("2. Feet to Meters");
            System.out.println("3. Miles to Kilometers");
            
            int whichLength = input.nextInt();
            input.nextLine();
            
            switch (whichLength)
            {
              case 1:
                System.out.println("What is the value you want to convert?");
                
                double inchesValue = input.nextDouble();
                input.nextLine();
                
                double resultCentimeters = inchesValue * 2.54;
                System.out.printf("%f inches is %f centimeters%n", inchesValue, resultCentimeters);
                break;
          
              case 2:
                System.out.println("What is the value you want to convert?");
                
                double feetValue = input.nextDouble();
                input.nextLine();
                
                double resultMeters = feetValue * 0.3048;
                System.out.printf("%f feet is %f meters%n", feetValue, resultMeters);
                break;
          
              case 3:
                System.out.println("What is the value you want to convert?");
                
                double milesValue = input.nextDouble();
                input.nextLine();
                
                double resultKilometers = milesValue * 1.60934;
                System.out.printf("%f miles is %f kilometers%n", milesValue, resultKilometers);
                break;
          
              default:
                System.out.printf("%d is not a valid option.%n", whichLength);
                break;
             }
             break;
         
            
          case 2:
            System.out.println("Which fluid volume do you want to convert? (type in \"1\" or \"2\")");
            System.out.println("1: Fluid ounces to Milliliters");
            System.out.println("2: Gallons to Liters");
            
            int whichVolume = input.nextInt();
            input.nextLine();
            
            switch (whichVolume)
            {
              case 1:
                System.out.println("What is the value you want to convert?");
                
                double fluidOuncesValue = input.nextDouble();
                input.nextLine();
                
                double resultMilliliters = fluidOuncesValue * 29.5735;
                System.out.printf("%f fluid ounces is %f milliliters%n", fluidOuncesValue, resultMilliliters);
                break;
          
              case 2:
                System.out.println("What is the value you want to convert?");
                
                double gallonsValue = input.nextDouble();
                input.nextLine();
                
                double resultLiters = gallonsValue * 3.785411784;
                System.out.printf("%f gallons is %f liters%n", gallonsValue, resultLiters);
                break;
                
              default:
                System.out.printf("%d is not a valid operator.%n", whichVolume);
                break;
            }
            break;
          
          case 3:
            System.out.println("Which mass do you want to convert? (type in \"1\" or \"2\")");
            System.out.println("1: Ounces to Grams");
            System.out.println("2: Pounds to Kilograms");
              
            int whichMass = input.nextInt();
            input.nextLine();
              
              switch (whichMass)
              {
                case 1:
                  System.out.println("What is the value you want to convert?");
                  
                  double ouncesValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultGrams = ouncesValue * 28.3495;
                  System.out.printf("%f ounces is %f grams%n", ouncesValue, resultGrams);
                  break;
            
                case 2:
                  System.out.println("What is the value you want to convert?");
                  
                  double poundsValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultKilograms = poundsValue * 0.453592;
                  System.out.printf("%f pounds is %f kilograms%n", poundsValue, resultKilograms);
                  break;
                  
                default:
                  System.out.printf("%d is not a valid operator.%n", whichMass);
                  break;
              }
              break;
        
        
          case 4:
            System.out.println("Which temperature do you want to convert? (type in \"1\" or \"2\")");
            System.out.println("1: Fahrenheit to Celsius");
            System.out.println("2: Celsius to Fahrenheit");
              
            int whichTemp = input.nextInt();
            input.nextLine();
              
              switch (whichTemp)
              {
                case 1:
                  System.out.println("What is the value you want to convert?");
                  
                  double ftempValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultCelsius = (ftempValue - 32) * (5.0/9.0);
                  System.out.printf("%f degrees Fahrenheit is %f degrees Celsius%n", ftempValue, resultCelsius);
                  break;
            
                case 2:
                  System.out.println("What is the value you want to convert?");
                  
                  double ctempValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultFahrenheit = ((9.0/5.0) * ctempValue) + 32;
                  System.out.printf("%f degrees Celsius is %f degrees Fahrenheit%n", ctempValue, resultFahrenheit);
                  break;
                  
                default:
                  System.out.printf("%d is not a valid operator.%n", whichTemp);
                  break;
          
          default:
            System.out.printf("%d is not a valid measurement type.%n, typeMeasure");
             break;
        }
        break;

    }
    else if (choiceConvert == 2)
    {
      // Metric to US conversion.
      
        System.out.println("Which type of measurement do you want to perform? (type in \"1\", \"2\", or \"3\")");
        System.out.println("1. Length");
        System.out.println("2. Fluid Volume");
        System.out.println("3. Mass");
    
        int typeMeasure = input.nextInt();
        input.nextLine();
        
          switch (typeMeasure)
          {
            case 1:
              System.out.println("Which length do you want to convert? (type in \"1\", \"2\", or \"3\")");
              System.out.println("1. Centimeters to Inches ");
              System.out.println("2. Meters to Feet");
              System.out.println("3. Kilometers to Miles");
              
              int whichLength = input.nextInt();
              input.nextLine();
              
              switch (whichLength)
              {
                case 1:
                  System.out.println("What is the value you want to convert?");
                  
                  double centimetersValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultInches = centimetersValue / 2.54;
                  System.out.printf("%f centimeters is %f inches%n", centimetersValue, resultInches);
                  break;
            
                case 2:
                  System.out.println("What is the value you want to convert?");
                  
                  double metersValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultFeet = metersValue * 3.28084;
                  System.out.printf("%f meters is %f feet%n", metersValue, resultFeet);
                  break;
            
                case 3:
                  System.out.println("What is the value you want to convert?");
                  
                  double kilometersValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultMiles = kilometersValue * 0.621371;
                  System.out.printf("%f kilometers is %f miles%n", kilometersValue, resultMiles);
                  break;
            
                default:
                  System.out.printf("%d is not a valid operator.%n", whichLength);
                  break;
            }
            break;

            case 2:
              System.out.println("Which fluid volume do you want to convert? (type in \"1\" or \"2\")");
              System.out.println("1: Milliliters to Fluid Ounces");
              System.out.println("2: Liters to Gallons");
              
              int whichVolume = input.nextInt();
              input.nextLine();
              
              switch (whichVolume)
              {
                case 1:
                  System.out.println("What is the value you want to convert?");
                  
                  double millitersValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultFluidOunces = millilitersValue * 0.033814;
                  System.out.printf("%f milliliters is %f fluid ounces%n", millilitersValue, resultFluidOunces);
                  break;
            
                case 2:
                  System.out.println("What is the value you want to convert?");
                  
                  double litersValue = input.nextDouble();
                  input.nextLine();
                  
                  double resultGallons = litersValue * 0.264172;
                  System.out.printf("%f liters is %f gallons%n", litersValue, resultGallons);
                  break;
                  
                default:
                  System.out.printf("%d is not a valid operator.%n", whichVolume);
                  break;
              }
              break;
                  
            case 3:
              System.out.println("Which mass do you want to convert? (type in \"1\" or \"2\")");
              System.out.println("1: Grams to Ounces");
              System.out.println("2: Kilograms to Pounds");
                
              int whichMass = input.nextInt();
              input.nextLine();
                
                switch (whichMass)
                {
                  case 1:
                    System.out.println("What is the value you want to convert?");
                    
                    double gramsValue = input.nextDouble();
                    input.nextLine();
                    
                    double resultOunces = gramsValue * 0.035274;
                    System.out.printf("%f grams is %f ounces%n", gramsValue, resultOunces);
                    break;
              
                  case 2:
                    System.out.println("What is the value you want to convert?");
                    
                    double kilogramsValue = input.nextDouble();
                    input.nextLine();
                    
                    double resultPounds = kilogramsValue * 2.20462;
                    System.out.printf("%f kilograms is %f pounds%n", kilogramsValue, resultPounds);
                    break;
                    
                  default:
                    System.out.printf("%d is not a valid operator.%n", whichMass);
                    break;
            
            default:
              System.out.printf("%d is not a valid measurement type.%n, typeMeasure");
               break;
            
         }
         break;
        }
    }
    else
    {
      // Handle invalid input
      System.out.println("Invalid choice. Please enter 1 or 2.");
    }

    input.close();
}
}
