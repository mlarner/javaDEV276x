import java.util.*

public class TripPlanner {
  public static void main (String[] args){
    
    greeting();
    travelTime();
    timeDifference();
    countryArea()
  }
  
  public static void greeting(String[] args){
  
    Scanner input = new scanner(System.in);
    
    System.out.println("Welcome to vacation planner!");
    System.out.println("What is your name?");
    String name = input.nextline();
    
    System.out.println("Nice to meet you " + name + ", where are you traveling to?");
    String destination = input.nextline();
    
    System.out.println("Great! " + destination + " sounds like a great trip");
    System.out.println("**********\n\n")
  }
  
  public static void travelTime(String[] args){
    Scanner input = new scanner(System.in);
    
    System.out.println("How many days are you going to spend travling?");
    String days = input.nextline();
    
    System.out.println("How much money, in usd, are you going to spend on your trip?");
    String budget = input.nextline();
    
    System.out.println("What is the three letter currency symbol?");
    String currencySymbol = input.nextline();
    
    System.out.println("How many " + currencySymbol + " are there in each dollar?");
    String currencyConversion = input.nextline();
    
    int hours = days * 24;
    int minutes = hours * 60;
    double dailyBudget = rounded(budget/days)'
    double convertedBudget = rounded(budget*currencyConversion);
    double convertedDaily = rounded(dailyBudget*currencyConversion);
    
    System.out.println("If you are traveling for " + days + " that is the same as " + days + " or " + minutes + " minutes.");
    System.out.println("If you are going to spend $" + budget + " that means per day you can spend up to $" + dailyBudget + " USD");
    System.out.println("Your total budget in " + currencySymbol + " is " + currencyConverted + " " + currencySymbol + "which per day is " + convertedDaily + " " + currencySymbol);
    
    System.out.println("**********\n\n");

  }

  public staic void timeDifference(String args[]){
    Scanner input = new scanner(System.in);
    
    System.out.println("What is the time difference, in hours, between your home and travel destination?");
    String timeDiff = input.nextline();
    
    int midnightConversion = timeDiff % 24;
    
    int noonConversion = (12 + timeDiff) % 24;
    
    System.out.println("That means when it is midnight at home it will be " + midnightConversion + ":00 in your travel destination and when it is noon at home it will be " + noonConversion + ":00");
  
  }
  
  public static void countryArea(String args[]){
  
  Scanner input = new scanner(system.in);
  System.out.println("What is the dquare area of your desitnation country in km2?");
  String km2 = input.nextline();
  
  double mi2 = km2 * 0.386102;
  double rounded = round(mi2);
  System.out.println("In miles2 that is " + rounded);
  
  }
  
  public static double round(double number){
  
    double answer = number * 100;
    int answerFromOne = (int) answer;
    double rounded = answerFromOne / 100.0;
    
    return rounded;
  }
  
  
}
