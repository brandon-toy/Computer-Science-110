//Name: Brandon Toy
//Date: November 19 2017
//ID: V00901130
//Course: CSC110\Assignment7
//Filename: CutupSongCreator.java
import java.util.*;
import java.io.*;


public class CutupSongCreator {
  public static void main(String[] args) {
    boolean truefalse = true;

    while(truefalse) {

    try {


    Scanner input = new Scanner(System.in);
    System.out.print("What is the name of the file? ");
    String filename = input.next();
    Scanner reader = new Scanner(new File(filename));

    SongLine woohoo[] = makeArray(reader);
    printArray(woohoo);


    System.out.print("What genre would you like? ");
    String filtername = input.next();
    listLinesByGenre(woohoo,filtername);

    System.out.println("Are you ready to sort the song by line number? Type a letter and press ENTER");
    String a = input.next();
    sortByLineNumber(woohoo);

    System.out.println("Are you ready to make a random song made up of 21 lines? Type a letter and press ENTER");
    String b = input.next();
    makeSong(woohoo);
    truefalse = false;

  } catch (Exception a) {
    System.out.println("Not a file");

  }
  }
}

//Makes an array of a line of the song
  public static SongLine[] makeArray(Scanner reader) { // reader equals the text file
    String genre = null;
    int lineNo = 0;
    String words = null;
    int linelength = reader.nextInt();
    SongLine songLine[] = new SongLine[linelength];

    for(int i = 0; i < linelength; i++) {
      genre = reader.next();
      lineNo = reader.nextInt();
      words = reader.nextLine();
      SongLine starwars = new SongLine(genre, lineNo, words);
        songLine[i] = starwars;
      }
    return songLine;
    }
//Filters the genre
  public static void listLinesByGenre(SongLine[] songs, String filterWord) {
    int length = songs.length;
    for(int i = 0; i < length; i++) {
      if ((songs[i].getGenre()).equalsIgnoreCase(filterWord)) {
        System.out.println(songs[i].toStringLineOnly());
    }
  }
}
//Prints the Array
  public static void printArray(SongLine[] songs) {
    for(int i =0; i < songs.length; i++) {
      System.out.println(songs[i]);
    }
  }
  //Sorts array by line number
  public static void sortByLineNumber(SongLine[] songs) {
    int length = songs.length;
    SongLine temp;
    for (int i = 0; i < length; i++) {
        for (int j = 1; j < (length - i); j++) {
      if ((songs[j-1].compareTo(songs[j]) > 0)) {
        temp = songs[j - 1];
        songs[j-1] = songs[j];
        songs[j] = temp;
      }
    }
  }
  printArray(songs);
}
//Makes a song of random numbers
  public static void makeSong(SongLine[] songs) {
    Random random = new Random();
    for(int i = 0; i < 21; i++) {
      int j = random.nextInt(songs.length);
      System.out.println(songs[j].getWords());
    }
}
}
