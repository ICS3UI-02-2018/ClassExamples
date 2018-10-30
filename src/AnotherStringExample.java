
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
public class AnotherStringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to translate into LEET");
        String word = input.nextLine();
        
        String translated = word.replace("a","@");
        translated = translated.replace("o", "0");
        translated = translated.replace("ck","xx");
        translated = translated.replace("s", "z");
        
        // recreating replace using replaceFirst
        while(translated.contains("i")){
            translated = translated.replaceFirst("i", "1");
        }
        
        
        System.out.println(word + " in LEET is " + translated);
        
        
        
        // indexOF example
        System.out.println("Enter a new word");
        String newWord = input.nextLine();
        
        // search for pp
        int position = newWord.indexOf("pp");
        String front = newWord.substring(0,position);
        String back = newWord.substring(position + 1);
        String ppRemoved = front+back;
        System.out.println(ppRemoved);
        
        
    }
    
}
