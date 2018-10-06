
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
public class ForLoopMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter another integer");
        int num2 = input.nextInt();
        
        int sum = 0;
        for(int i = 0; i < num2; i++){
            sum = sum + num1;
        }
        
        System.out.println("The product is " + sum);
                
    }
    
}
