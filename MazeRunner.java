//DEV 276x EDX Java Course Final Project
//Max Larner
//Run through a generated maze
//~1hr to complete - Supplied maze generator has underlying issues, could not complete code and won't bother trying to fix it

import java.util.Scanner;

public class MazeRunner {

    public static void main(String args[]){

        System.out.println("hello world");

        Maze myMap = new Maze();
        int moves = 0;

        intro(myMap);

        while(myMap.didIWin() == false && moves <= 100){

            move(myMap);
            moves++;

            movesMessage(moves);
            if (moves == 100) {
                System.out.println("Sorry, but you didn't escape in time - you lose!!");
            }
            if(myMap.didIWin() == true){
                System.out.println("Congratulations, you made it out alive! And you did it in " + moves + " moves");
            }
        }


    }

    public static void intro(Maze myMaze){
        System.out.println("Welcome to Maze Runner!!!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }

    public static void move(Maze myMaze) {

        Scanner move = new Scanner(System.in);
        System.out.println("Where would you like to move?");
        String myMove = move.nextLine();

        if (myMove.equals("R")) {
            if (myMaze.canIMoveRight() == false) {
                System.out.println("Sorry, you've hit a wall.");
            } else {
                myMaze.moveRight();
            }
        }

        else if (myMove.equals("L")){
            if (myMaze.canIMoveLeft() == false) {
                System.out.println("Sorry, you've hit a wall.");
            } else {
                myMaze.moveLeft();
            }
        }

        else if (myMove.equals("U")) {
            if (myMaze.canIMoveUp() == false) {
                System.out.println("Sorry, you've hit a wall.");
            } else {
                myMaze.moveUp();
            }
        }
        else if (myMove.equals("D")) {
            if (myMaze.canIMoveDown() == false) {
                System.out.println("Sorry, you've hit a wall.");
            } else {
                myMaze.moveDown();
            }
        }
        else{
            System.out.println("Enter a valid direction");
        }

        myMaze.printMap();
    }

    public static void movesMessage(int moves){

        switch (moves){
            case 50:
                System.out.println("Warning: You have made 50 moves. You have 50 moves remaining before the maze exit closes.");
                break;
            case 75:
                System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
                break;
            case 90:
                System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
                break;
            case 100:
                System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
                break;
        }
    }

    public static void jumpPit(Maze myMap){

        

    }
}

