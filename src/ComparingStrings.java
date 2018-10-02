
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class ComparingStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer");
        int num = input.nextInt();
        
        // clear the buffer
        // when switching from ints to words/Strings
        input.nextLine();
               
        System.out.println("Do you want me to continue?");
        String answer = input.nextLine();
        
        // compare strings in the special way!
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("I will continue");
        }else{
            System.out.println("Goodbye!");
        }
    }
    
}
