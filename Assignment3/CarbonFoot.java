//Name: Brandon Toy
//ID: V00901130
//Date: October 3rd 2017
//Filename: CarbonFoot.java
//Details: \CSC110\Assignment 3
import java.util.*;
  public class CarbonFoot {

    public static double transportationFootprint(double kPD, double effic) {
      double answer = 2.3*(365*(kPD/effic));
      return answer;
  }
    public static double electricityFootprint(double kWhPerMonth, int num) {
      double conclusion = (kWhPerMonth * 12 * 0.257)/num;
      return conclusion;
  }
    public static double foodFootprint(double meat, double dairy, double fv, double carb) {
      double matt = (meat * 0.531) + (dairy*0.138) + (fv*0.076) + (carb * 0.031);
      return matt;
  }
    public static double totalFootprint(double trans, double elec, double food){
      double sedin = (trans + elec + food)/1000;
      return sedin;
  }
    public static void main(String[] args) {  
      Scanner pokemon = new Scanner(System.in);

      //TransportationFootprint

      System.out.print("How many km do you drive in one day? ");
      double magmar = pokemon.nextDouble();
      System.out.println("Choose the appropriate fuel efficiency for your car: ");
      System.out.println("\tvery small car: 7.1 km/litre");
      System.out.println("\tsmall car: 8.2 km/litre");
      System.out.println("\tsports car: 14.9 km/litre");
      System.out.println("\tSUV: 12.3 km/litre");
      System.out.print("Or, if you know the efficiency number, choose another number: ");
      double pikachu = pokemon.nextDouble();
      double answer = transportationFootprint(magmar,pikachu);
      System.out.println("Your Carbon footprint with respect to car use is "+answer+"kg/year.");

      //ElectricityFootprint

      System.out.print("What is the average electricity consumption per month, in kilowatts? ");
      double bulbasaur = pokemon.nextDouble();
      System.out.print("How many people live in the house? ");
      int charmander = pokemon.nextInt();
      double statement = electricityFootprint(bulbasaur,charmander);
      System.out.println("Your Carbon footprint with respect to electricity use is "+statement+"kg/year");

      //FoodFootprint

      System.out.print("Of all the food you eat, what percent consists of meat or fish? ");
      int cop = pokemon.nextInt();
      System.out.print("Of all the food you eat, what percent consists of dairy products? ");
      int omar = pokemon.nextInt();
      System.out.print("Of all the food you eat, what percent consists of fruit and vegetables? ");
      int uzi = pokemon.nextInt();
      System.out.print("Of all the food you eat, what percent consists of carbohydrates? ");
      int lil = pokemon.nextInt();
      double Tibor = foodFootprint(cop,omar,uzi,lil);
      System.out.println("Your Carbon footprint with respect to food consumption is "+Tibor+"kg/year.");

      //TotalFootprint

      double vancouveristhebestcity = totalFootprint(answer,statement,Tibor);
      System.out.println("You produce an annual total of "+vancouveristhebestcity+" metric tons of C02 per year.");
      //:)
    }
  }
