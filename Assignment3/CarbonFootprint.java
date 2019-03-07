//Name: Brandon Toy
//ID: V00901130
//Date: October 3rd 2017
//Filename: CarbonFootprint.java
//Details: \CSC110\Assignment 3
import java.util.*;
  public class CarbonFootprint {
    //Calculates the kilograms of CO2 emissions in a single year, based on home electricity use.
      public static double transportationFootprint(double kPD, double effic){
      Scanner pokemon = new Scanner(System.in);
      System.out.print("How many km do you drive in one day? ");
      kPD = pokemon.nextDouble();
      System.out.println("Choose the appropriate fuel efficiency for your car: ");
      System.out.println("\tvery small car: 7.1 km/litre");
      System.out.println("\tsmall car: 8.2 km/litre");
      System.out.println("\tsports car: 14.9 km/litre");
      System.out.println("\tSUV: 12.3 km/litre");
      System.out.print("Or, if you know the efficiency number, choose another number: ");
      effic = pokemon.nextDouble();
      double lupy = 365 * (kPD/effic);
      double transp = 2.3 * lupy;
      System.out.println("Your Carbon footprint with respect to car use is "+transp+"kg/year.");
      return transp;
    }
    //Calculates the kilograms of CO2 emissions in a single year, based on the percentages of types of food in a person's diet.
    public static double electricityFootprint(double kwHours, int num) {
      Scanner pikachu = new Scanner(System.in);
      System.out.print("What is the average electricity consumption per month, in kilowatts? ");
      kwHours = pokemon.nextDouble();
      System.out.print("How many people live in the house? ");
      num = pokemon.nextInt();
      double electabuzz = (kwHours * 12 * 0.257)/num;
      System.out.println("Your Carbon footprint with respect to electricity use is "+electabuzz+"kg/year");
      return electabuzz;
    }
    public static double foodFootprint(double meat, double dairy, double fv, double carb) {
      Scanner munchlax = new Scanner(System.in);
      System.out.print("Of all the food you eat, what percent consists of meat or fish? ");
      meat = munchlax.nextInt();
      double steak = meat * 0.531;
      System.out.print("Of all the food you eat, what percent consists of dairy products? ");
      dairy = munchlax.nextInt();
      double milky = dairy * 0.138;
      System.out.print("Of all the food you eat, what percent consists of fruit and vegetables? ");
      fv = munchlax.nextInt();
      double fruits = fv * 0.076;
      System.out.print("Of all the food you eat, what percent consists of carbohydrates? ");
      carb = munchlax.nextInt();
      double carbo = carb * 0.031;
      double answer = steak + milky + fruits + carbo;
      System.out.println("Your Carbon footprint with respect to food consumption is "+answer+"kg/year.");
      return answer;
    }

    public static double totalFootprint(double trans, double elec, double food) {
        double tco = (trans + elec + food)/1000;
      return tco;
    }

    public static void main(String[] args) {
      double gogoat = transportationFootprint(0,0);
      System.out.println();
      double raichu = electricityFootprint(0,0);
      System.out.println();
      double snorlax = foodFootprint(0,0,0,0);
      System.out.println();
      double finish = totalFootprint(gogoat, raichu, snorlax);
      System.out.println("You produce an annual total of "+tco+" metric tons of C02 per year.");

    }


  }
