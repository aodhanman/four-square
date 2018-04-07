package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aodhan
 */
public class Runner {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Random r = new Random();
        String key = "";
        char[] keyArray = {};
        char[] letters = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] keyChar = key.toCharArray();
        List<Character> chars = new ArrayList<>() ;
        List<Character> keyList = new ArrayList<>() ;
        
        
        
            Encrypt enc = new Encrypt();
            
            enc.fillchar(enc.square1);
            
            System.out.println(enc.square1[2][2]);

            
        System.out.println("Enter 1 to enter keyphrase");
        System.out.println("Enter 2 to generate random key");
       
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (char ch: letters){
            chars.add(ch);
        }
        
        
        
        if (in == 1){
            System.out.println("please enter your key ");
            sc.next(key);
            keyChar = key.toCharArray();
            
        }else if (in == 2){
            System.out.println("Your key will be generated");
            for (char ch: letters){
                
            chars.add(ch);
        }
                    
       
       // System.out.println(enc.letters[2]);
      //  System.out.println(enc.square1[2][2]);
        System.out.println("Fail");
        
        

        }}}
    

