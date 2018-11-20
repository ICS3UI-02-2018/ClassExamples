
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
public class MethodExample {

    public static void sayHello(){
        System.out.println("Hello World");
    }
    
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    
    public static double areaRect(double length, double width){
        double area = length * width;
        return area;
    }
    
    public static String binaryConvert(int num){
        String answer = "";
        while(num > 0){
            int remainder = num % 2;
            num = num/2;
            answer = remainder + answer;
        }
        return answer;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sayHello();
        sayHello("Steve");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        String personName = in.nextLine();
        sayHello(personName);
        
        System.out.println("Please enter a length.");
        double length = in.nextDouble();
        System.out.println("Please enter a width.");
        double width = in.nextDouble();
        
        double area = areaRect(length,width);
        System.out.println("The area is " + area);
        
        System.out.println("Please enter a number to convert");
        int num = in.nextInt();
        String converted = binaryConvert(num);
        System.out.println(converted);
    }
    
}
