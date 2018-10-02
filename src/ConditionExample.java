
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
public class ConditionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user for 2 numbers
        System.out.println("Please enter an integer");
        int num1 = input.nextInt();
        
        System.out.println("Please enter a second integer");
        int num2 = input.nextInt();
        
        // let the user know which is bigger
        if(num1 > num2){
            System.out.println("The first number is bigger");
        }else if(num2 > num1){
            System.out.println("The second number is bigger");
        }else{
            System.out.println("Those numbers are equal");
        }
        
        // if num1 is bigger than 10 and num2
        if(num1 > 10 && num1 > num2){
            System.out.println("num1 is bigger than 10");
            System.out.println("It is also bigger than num2");
        }
        
        // if any of the numbers was negative
        if(num1 < 0 || num2 < 0){
            System.out.println("A number is negative");
        }
        
        
        
    }
    
}
