import java.util.*;
public class CalendarGames {
public static void main (String[] args) {
  guessMyBirthday();
}
public static String monthToString(int month){

  if(month == 1)
    return "January";
   else if(month == 2) {
    return "February";
  } else if(month == 3) {
    return "March";
  } else if(month == 4) {
    return "April";
  } else if(month == 5){
    return "May";
  } else if(month == 6){
    return "June";
  } else if(month == 7){
    return "July";
  } else if(month == 8){
    return "August";
  } else if(month == 9){
    return "September";
  } else if(month == 10){
    return "October";
  } else if(month == 11){
    return "November";
  } else {
    return "December";
}
}
public static boolean isLeapYear(int year){
  boolean tibor;
  if (year % 4 == 0) {
    tibor = false;
  } else if(year % 100 == 0){
    tibor = true;
  } else if(year % 400 == 0) {
    tibor = false;
  } else
    tibor = true;
    return tibor;
}
public static int numDaysInMonth(int month, int year){
  if(month == 1) {
    return 31;
  } else if (month == 2) {
      boolean test = isLeapYear(year);
    if (test == true) {
        return 28;
  } else {
      return 29;
    }
  }
 else if (month == 3) {
  return 31;
} else if (month == 4) {
  return 30;
} else if (month == 5) {
  return 31;
} else if (month == 6) {
  return 30;
} else if (month == 7) {
  return 31;
} else if (month == 8) {
  return 31;
} else if (month == 9) {
  return 30;
} else if (month == 10) {
  return 31;
} else if (month == 11) {
  return 30;
} else {
  return 31;
}
}
public static void guessMyBirthday() {
  Scanner console = new Scanner(System.in);
  int min = 1;
  int max = 12;
  boolean y = true;
  int middle;
  String test;
  String yesno = "no";
  String yay;
  while(y) {

    middle = (min+max)/2;
    test = monthToString(middle);
    System.out.print("Is your birthday "+test);
    yesno = console.next();

    if(yesno.equals("no")) {

      System.out.println("Is your birthday after this month? yes or no");
      yesno = console.next();

      if(yesno.equals("yes"));
      min = middle + 1;

    } else
      max = middle;


  }
  }
}
