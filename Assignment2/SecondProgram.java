//Name: Brandon Toy
//ID: V00901130
//Date: September 29 2017
//Filename: SecondProgram.java
//Details: \CSC 110\ Assignment 2
import java.util.*;
public class SecondProgram {
 public static void main(String[] args) {
   printOwl();
   System.out.println();
   areaCircle();
 }
  public static void printMessage() {

    Scanner console = new Scanner(System.in);
    System.out.print("What does the wise of the wisest owl say to the wisest person? ");
    String statement = console.nextLine();
    int stars = statement.length();
    int therightstars = stars + 3;

    for(int i = 1; i < therightstars; i++) {
      System.out.print("*");
    }
    System.out.println();
    System.out.println("|"+statement+"|");
    for(int i = 1; i < therightstars; i++) {
      System.out.print("*");
  }
}

public static void printOwl() {
  printMessage();
 System.out.println();
 System.out.println("         \\");
 System.out.println("          \\");
 System.out.println("           ^...^");
 System.out.println("          / o,o \\");
 System.out.println("          |):::(|");
 System.out.println("         ===w=w=== ");

 }


 public static void areaCircle() {
  Scanner console = new Scanner(System.in);
  System.out.print("Give the radius of the circle: ");
    double nextTerm = 1;
    double denom = 1;
    double series = 0;
  for(int i = 0; i < 1000000; i++) {
   series = (series + nextTerm/denom);
   denom = (denom + 2);
   nextTerm = (nextTerm * -1);
 }
    double radius = console.nextDouble();
    double radius2x = radius * radius;
    double answer = (series * 4) * + radius2x;
    System.out.println("The area of a circle with a radius of " + radius + " is: " +answer);
  }
 }
