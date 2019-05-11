import java.util.*;

public class TripPlanner {

    public static void main(String[] args) {

        greeting();
        travelTime();
        timeDifference();
        countryArea();
    }

    public static void greeting() {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to vacation planner!");
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Nice to meet you " + name + ", where are you traveling to?");
        String destination = input.nextLine();

        System.out.println("Great! " + destination + " sounds like a great trip");
        System.out.println("**********\n\n");
    }

    public static void travelTime() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many days are you going to spend travling?");
        String days = input.nextLine();
        int daysInt = Integer.parseInt(days);

        System.out.println("How much money, in usd, are you going to spend on your trip?");
        String budget = input.nextLine();
        int budgetInt = Integer.parseInt(budget);

        System.out.println("What is the three letter currency symbol?");
        String currencySymbol = input.nextLine();

        System.out.println("How many " + currencySymbol + " are there in each dollar?");
        String currencyConversion = input.nextLine();
        double currencyConversionDbl = Double.parseDouble(currencyConversion);

        int hours = daysInt * 24;
        int minutes = hours * 60;
        double dailyBudget = round(budgetInt / daysInt);
        double convertedBudget = round(budgetInt * currencyConversionDbl);
        double convertedDaily = round(dailyBudget * currencyConversionDbl);

        System.out.println("If you are traveling for " + days + " that is the same as " + days + " or " + minutes + " minutes.");
        System.out.println("If you are going to spend $" + budget + " that means per day you can spend up to $" + dailyBudget + " USD");
        System.out.println("Your total budget in " + currencySymbol + " is " + convertedBudget + " " + currencySymbol + "which per day is " + convertedDaily + " " + currencySymbol);

        System.out.println("**********\n\n");
    }

    public static void timeDifference() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the time difference, in hours, between your home and travel destination?");
        String timeDiff = input.nextLine();

        int timeDiffInt = Integer.parseInt(timeDiff);

        int midnightConversion = timeDiffInt % 24;

        int noonConversion = (12 + timeDiffInt) % 24;

        System.out.println("That means when it is midnight at home it will be " + midnightConversion + ":00 in your travel destination and when it is noon at home it will be " + noonConversion + ":00");

    }

    public static void countryArea() {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the dquare area of your desitnation country in km2?");
        String km2 = input.nextLine();
        int km2Int = Integer.parseInt(km2);

        double mi2 = km2Int * 0.386102;
        double rounded = round(mi2);
        System.out.println("In miles2 that is " + rounded);

    }

    public static double round(double number) {

        double answer = number * 100;
        int answerFromOne = (int) answer;
        double rounded = answerFromOne / 100.0;

        return rounded;
    }
}
