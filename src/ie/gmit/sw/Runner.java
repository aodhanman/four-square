package ie.gmit.sw;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aodhan
 */
public class Runner {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Encrypt enc = new Encrypt();
        // new encryption class
        Reader read = new Reader();
        //creates string array to hold bigram 
        
        Random r = new Random();
        //random
        //key string and arrays
        String message ="";
        String key = "";
        char[] keyArray = {};
        char[] letters2 = enc.lettersArray;
        char[] letters = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] keyChar = key.toCharArray();
        StringBuilder keyString = new StringBuilder();
        List<Character> chars = new ArrayList<>() ;
        List<Character> keyList = new ArrayList<>() ;
       //method to fill polybius square    
            enc.fillchar(enc.polySquare);
            for(int j = 0; j < 5; j++){
                    System.out.println(enc.polySquare[1][j]);
                }   
            
       // C:\Users\aodhan\Documents\NetBeansProjects\four-square\src\ie\gmit\sw
                
        System.out.println("Enter 1 to enter keyphrase");
        System.out.println("Enter 2 to generate random key");
       //prompt for user input
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
       //if else for users key selection
        if (in == 1){
            int x = 0;
            System.out.println("please enter your key ");
            keyString.append(sc.next());
            while(keyString.length() < 25){
                System.out.println("please enter more");
                keyString.append(sc.next());

            }
            
        }else if (in == 2){
            System.out.println("Your key will be generated");
            for (char ch: letters2){
                
                chars.add(ch);
                 
        }for(int j = 0; j < 4; j++){
                        System.out.println(chars.get(j));
                        System.out.println("Bigram: " + Encrypt.bigram(Reader.content)[j]);
                    }  
       // System.out.println(enc.letters[2]);
      //  System.out.println(enc.square1[2][2]);
        System.out.println("Fail");
            }
        }
    }
