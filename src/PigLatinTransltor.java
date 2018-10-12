
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
public class PigLatinTransltor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user for a word to translate
        System.out.println("Please enter a word to translate");
        String word = input.nextLine();
        
        // make everything lowercase
        word = word.toLowerCase();
        
        // if the word begins with a vowel
        if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")){
            // does the word end with a vowel?
            if(word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u")){
                // add hay to the end of the word
                System.out.println(word + " in PigLatin is " + word + "hay");
            }else{
                // add ay to the end of the word
                System.out.println(word + " in PigLatin is " + word + "ay");
            }        
        }else{
            // loop through each character
            int wordLength = word.length();
            for(int i = 0; i < wordLength; i++){
                // if the character is a vowel
                char letter = word.charAt(i);
                if(letter == 'a' || letter == 'i' || letter == 'e' || letter == 'o' || letter == 'u'){
                    // move all letters before vowel to the end
                    String front = word.substring(0,i);
                    String back = word.substring(i);
                    String newWord = back + front;
                    // also add ay to the end
                    newWord = newWord + "ay";
                    System.out.println(word + " in PigLatin is " + newWord);
                    // break the loop
                    break;
                }
                    
            }
                
        }
            
    }
    
}
