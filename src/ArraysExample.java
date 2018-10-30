
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
public class ArraysExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numMarks = 10;
        
        // create an integer array with 5 spots
        int[] grades = new int[numMarks];
        
//        grades[0] = 5;
//        grades[1] = -1273;

        // use a loop to enter each grade
        for(int i = 0; i < numMarks; i++){
            System.out.println("Please enter a grade");
            grades[i] = input.nextInt();
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("The grades were");
        for(int i = 0; i < grades.length; i++){
            System.out.println(grades[i]);
        }
        
        // add all of the grades
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum = sum + grades[i];
        }
        // sum now has all marks added together
        int average = sum/grades.length;
        System.out.println("Average mark is "+ average);
        
        

    }
    
}
