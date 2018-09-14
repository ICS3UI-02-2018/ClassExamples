
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * My first Java program
 * @author lamon
 */
public class MyFirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // print a bunch of text to the screen
        System.out.println("Hello world!");
        System.out.println("How are you doing?");
        // This print statement stays on the same line
        System.out.print("I am good. ");
        System.out.println("Thanks for asking");
        
        // Create a Scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        // create a String to store the user's name
        String usersName = input.nextLine();
        // output the user's name
        System.out.println("Hello " + usersName);
        
        // get the user's age
        System.out.println("Please enter your age");
        int usersAge = input.nextInt();
        
        // calculate approximate birth year
        int birthYear = 2018 - usersAge;
        System.out.println("You were born in the year " + birthYear + "!");
        double a = 5;
        double ans =a/2;
        System.out.println("5/2 is"+ ans);
    }
    
}
