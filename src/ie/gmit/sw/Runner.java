package ie.gmit.sw;

import static ie.gmit.sw.Reader.content;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
        StringBuilder keyString2 = new StringBuilder();

        List<Character> chars = new ArrayList<>() ;
        List<Character> chars2 = new ArrayList<>() ;

        List<Character> keyList = new ArrayList<>() ;
       //method to fill polybius squares using multi dim arrays    
            enc.fillchar(enc.polySquare1);
            enc.fillchar(enc.polySquare2);
            
       // C:\Users\aodhan\Documents\NetBeansProjects\four-square\src\ie\gmit\sw
                
        System.out.println("Enter 1 to enter keyphrase");
        System.out.println("Enter 2 to generate random key");
        System.out.println("Enter 3 to quit");
       //prompt for user input
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        //if else for users key selection
        switch (in) {
            case 1:
                int x = 0;
                HashSet<Character> used = new HashSet<Character>();
                System.out.println("please enter your first key ");
                keyString.append(sc.next());
                // while keystring is less than 25
                while(keyString.length() < 25){
                    while(keyString.length() < 25){
                    System.out.println("please enter more");
                    keyString.append(sc.next());
                }  
                   /* for(int i = 0; i < 25; i++){
                        //adds to hashset to ensure no duplicates
                        used.add(keyString.charAt(x));
                        System.out.println("please enter more");
                        if(!used.contains(keyString.charAt(x))){
                            keyString.append(sc.next());
                        }
                    }
                   */ 
                }   System.out.println("first key: " + keyString.toString());
                System.out.println("please enter your second key ");
                keyString2.append(sc.next());
                while(keyString2.length() < 25){
                    System.out.println("please enter more");
                    keyString2.append(sc.next());
                }  
                
                System.out.println("second key: " + keyString2.toString());
                //not working, ran out of time
                // Encrypt.convertChar(Encrypt.polySquare1, keyString.toString());
                // Encrypt.convertChar(Encrypt.polySquare2, keyString2.toString());

                System.out.println("Encrpted text:");
                System.out.println(enc.encrypt2(read.content, keyString.toString(), keyString2.toString()));
                
                System.out.println("");

                System.out.println("Decrpted text:");

                System.out.println(enc.decrypt2(Encrypt.encrypted, keyString.toString(), keyString2.toString()));
                
                
                break;
            case 2:
                System.out.println("Your key will be generated");
                for (char ch: letters2){
                    
                    chars.add(ch);
                    
                }       for (char ch: letters2){
                    
                    chars2.add(ch);
                    
                }       Collections.shuffle(chars);
                Collections.shuffle(chars2);
                //fills polysquares with generated keys
                Encrypt.convertChar(Encrypt.polySquare3, chars.toString());
                Encrypt.convertChar(Encrypt.polySquare4, chars2.toString());
                // passing polybius sqaure array and key char as a string
                System.out.println("Encrypted text is: ");
                //Encrypt.convertChar(Encrypt.polySquare1, chars.toString());
                // enc.decrypt(answer, key);
                // o(n) time
                
                System.out.println(enc.encrypt2(read.content, chars.toString(), chars2.toString()));
                
                System.out.println("");

                System.out.println("Decrpted text:");

                System.out.println(enc.decrypt2(Encrypt.encrypted, chars.toString(), chars2.toString()));
                
                break;
            case 3:
                System.out.println("Goodbye");
                System.exit(0);
            default:
                break;
        }
        
        }   
    }
