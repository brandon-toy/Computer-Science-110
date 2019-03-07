//Name: Brandon Toy
//ID: V00901130
//Date: Monday October 30th 2017
//FileName: DNASequencing.java
//Details: \CSC 110\ Assignment 5

import java.util.*;

public class DNASequencing {
  public static void main(String[] args) {

    String[] testArray = {"AACCC", "GTT", "AC", "AACC", "AAAAAACCCCCCC", "AAAACCC", "AC"};
    System.out.println("The array contains the following: ");
    printArray(testArray);

    String longest = findLongest(testArray);
    System.out.println("The longest String is "+longest);

    int frequency = findFrequency("AC", testArray);
    System.out.println("The strand AC repeats: "+frequency+" times");

    boolean mutation = hasMutation("AAAAAACCCCCCC");
    System.out.println("Does the DNA strand have a mutation? " +mutation);

    int TotalMutations = countTotalMutations(testArray);
    System.out.println("The number of mutations in this DNA strand is: "+TotalMutations);


    int Numberofmutations = findFreqWithMutations("AC", testArray);
    System.out.println("The number of mutations of AC is "+Numberofmutations);

  }
  public static int countTotalMutations(String[] seqArray) {

    //Counts the number of mutated DNA sequences that occur within an array.

    int numbercount = 0;
    for(int i = 0; i < seqArray.length; i++) {
      boolean answer = hasMutation(seqArray[i]);
      if(answer == true) {
        numbercount++;
    }
  }
    return numbercount;  }

  public static int findFrequency(String target, String[] strings) {

    //Determines the number of times a particular item
    //occurs within an array of String objects.

    int number = 0;
    for(int i = 0; i < strings.length; i++) {
      if(strings[i] == target) {
        number++;
      }
    }

    return number;
  }
  public static int findFreqWithMutations(String target, String[] strings) {

    //Determines the number of times a
    //particular DNA sequence occurs within an array of DNA sequences.

    String nothappy;
    String HelpPls;
    int a = 0;
    String Macklemore;

      for(int i = 0; i < strings.length; i++) {

        Macklemore = strings[i];
        HelpPls = helperMethod(Macklemore);

        if(target.equals(HelpPls)) {
        a++; }
      }

    return a;
}

//Demutates a string

  private static String helperMethod(String target) {

    String NoMutation = "";
    int lastletter = target.length() - 1; //Gets the number of the last number
    char reallast = target.charAt(lastletter); //Makes the last number of the array called target, into the character of the target which is the last letter
    String test = Character.toString(reallast);
    String no = "";
    char firstletter;
    char secondletter;
    if(hasMutation(target) == true) {
      for(int i = 0; i < target.length() -1; i++) {
        firstletter = target.charAt(i);
        secondletter = target.charAt(i + 1);
        if (firstletter != secondletter) {
          NoMutation = NoMutation + firstletter;
      }
    }
  }
    return NoMutation + test;
  }
  public static String findLongest(String[] strings) {

    //Finds the first occurrence of the longest item in an array of String objects.

    String longest = " ";
    int wordlength = 0;
    for(int i = 0; i < strings.length; i++){
      if(strings[i].length() > wordlength) {
        longest = strings[i];
        wordlength = strings[i].length();
      }
    }

    return longest;
  }
  public static boolean hasMutation(String sequence) {

    //Determines if a given DNA sequence has a mutation

    boolean trufalse = false;

    for(int i = 0; i < sequence.length() - 1; i++) {
      char firstletter = sequence.charAt(i);
      char secondletter = sequence.charAt(i + 1);
      if (firstletter == secondletter) {
        trufalse = true;
      } else {
        trufalse = false;
      }
    }
    return trufalse;
  }
  public static void printArray(String[] strings) {

    //Prints out the contents of an array, one item per line

    for(int i = 0; i < strings.length; i++) {
        System.out.println(strings[i]);
    }

    }
  }
