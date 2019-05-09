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
    
    System.out.println("what is the three letter currency symbol ");
    System.out.println("**********\n\n")

  }

  public staic void timeDifference(String args[]){
  
  
  }
  
  public static void countryArea(String args[]){
  
  
  }
  
  public static void round(){
  
  }
  
  
}
