//Name: Brandon Toy
//ID: V009011030
//Sept. 22 2017
//Filename: FirstProgram.java
//Details \CSC 110\Assignment 1

//The class FirstProgram contains methods for
//frog & owl drawings. It also includes a method
//for approximating Pi.
public class FirstProgram {
  public static void main(String[] args) {
    printOwl();
    System.out.println();
    printFrog();
    System.out.println();
    approxPi();
  }
  //This method cotains a drawing of a frog.
  public static void printFrog() {
    System.out.println("  @..@");
    System.out.println(" (----)");
    System.out.println(" (>__<)");
    System.out.println("\"\"    \"\"");
}
  //This method contains a drawing of an owl.
  public static void printOwl() {
    System.out.println("  ^...^");
    System.out.println(" / o,o \\");
    System.out.println(" |):::(|");
    System.out.println("===w=w=== ");
}
  //This method is estimating Pi by using a for loop.
  public static void approxPi() {
    double nextTerm = 1; //1 is being assigned to nextTerm
    double denom = 1;//1 is being assigned to denom
    double series = 0;//0 is being assigned to series
    for(int i = 0; i < 8; i++) { //I am looping the next set of statements
      //then multiply the whole equation by 4 to approximate pi
      series = (series + nextTerm/denom);
      denom = (denom + 2);
      nextTerm = (nextTerm * -1);//
    }
    System.out.println("My estimate for pi is: " + series * 4);
  }
}
//It works :)
