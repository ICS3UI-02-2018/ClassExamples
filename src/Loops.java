
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
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a count variable
        int count = 10;
        int upTo = 10;
        // while loop condition
        while(count < 10){
            System.out.println("count: " + count);
            // add 1 to the count variable
            count = count + 1;
        }
        // after the loop is over
        System.out.println("All done!");
        
        System.out.println("");
        System.out.println("");
        
        // reuse the count variable
        count = 0;
        do{
            System.out.println("count: " + count);
            count++;
        }while(count < 10);
        
        
        // using loop as error catching
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int num = input.nextInt();
        // verify it is good
        while(num < 1 || num > 10){
            System.out.println("Try again. BETWEEN 1 and 10");
            num = input.nextInt();
            if(num == 1337){
                break;
            }
        }
        
        
        // a for loop
        for(int i = 0; i < 10; i = i + 1){
            System.out.println("count: " + i);
        }
        
        
        // a sum variable to add everything into
        int sum = 0;
        // get five marks
        for(int i = 0; i < 5; i++){
            // get the mark from the user
            System.out.println("Please enter a mark");
            int mark = input.nextInt();
            // add mark into sum
            sum = sum + mark;
        }
        int average = sum/5;
        System.out.println("Your average is " + average);
        
    }
    
}
