
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

    // Length variables
//    double resultCentimeters = 0;
//    double resultMeters = 0;
//    double resultKilometers = 0;
//    double resultInches = 0;
//    double resultFeet = 0;
//    double resultMiles = 0;
//
//    // Volume variables
//    double resultMilliliters = 0;
//    double resultLiters = 0;
//    double resultFluidOunces = 0;
//    double resultPounds = 0;
//
//    // Mass Variables
//    double resultGrams = 0;
//    double resultKilograms = 0;
//    double resultOunces = 0;
//
//    // Temperature variables
//    double resultCelsius = 0;
//    double resultFahrenheit = 0;
    
  

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
                
                resultCentimeters = inchesValue * 2.54;
                System.out.printf("%f inches is %f centimeters%n", inchesValue, resultCentimeters);
                break;
          
              case 2:
                System.out.println("What is the value you want to convert?");
                
                double feetValue = input.nextDouble();
                input.nextLine();
                
                resultMeters = feetValue * 0.3048;
                System.out.printf("%f feet is %f meters%n", feetValue, resultMeters);
                break;
          
              case 3:
                System.out.println("What is the value you want to convert?");
                
                double milesValue = input.nextDouble();
                input.nextLine();
                
                resultKilometers = milesValue * 1.60934;
                System.out.printf("%f miles is %f kilometers%n", milesValue, resultKilometers);
                break;
          
              default:
                System.out.printf("%d is not a valid operator.%n", whichLength);
            }
            
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
                
                resultMilliliters = fluidOuncesValue * 29.5735;
                System.out.printf("%f fluid ounces is %f milliliters%n", fluidOuncesValue, resultMilliliters);
                break;
          
              case 2:
                System.out.println("What is the value you want to convert?");
                
                double gallonsValue = input.nextDouble();
                input.nextLine();
                
                resultLiters = gallonsValue * 3.785411784;
                System.out.printf("%f gallons is %f liters%n", gallonsValue, resultLiters);
                break;
                
              default:
                System.out.printf("%d is not a valid operator.%n", whichVolume);
                
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
                
                resultGrams = ouncesValue * 28.3495;
                System.out.printf("%f ounces is %f grams%n", ouncesValue, resultGrams);
                break;
          
              case 2:
                System.out.println("What is the value you want to convert?");
                
                double poundsValue = input.nextDouble();
                input.nextLine();
                
                resultKilograms = poundsValue * 0.453592;
                System.out.printf("%f pounds is %f kilograms%n", poundsValue, resultKilograms);
                break;
                
              default:
                System.out.printf("%d is not a valid operator.%n", whichMass);
        
       }
      
        
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
                
                resultCelsius = (ftempValue - 32) * (5/9);
                System.out.printf("%f degrees Fahrenheit is %f degrees Celsius%n", ftempValue, resultCelsius);
                break;
          
              case 2:
                System.out.println("What is the value you want to convert?");
                
                double ctempValue = input.nextDouble();
                input.nextLine();
                
                resultFahrenheit = ((9/5) * ctempValue) + 32;
                System.out.printf("%f degrees Celsius is %f degrees Fahrenheit%n", ctempValue, resultFahrenheit);
                break;
                
              default:
                System.out.printf("%d is not a valid operator.%n", whichTemp);
        
       }

    }
    else if (choiceConvert == 2)
    {
      // Metric to US conversion.
        

    }
    else
    {
      // Handle invalid input
      System.out.println("Invalid choice. Please enter 1 or 2.");
    }

  }

