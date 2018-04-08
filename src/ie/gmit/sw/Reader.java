package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class Reader {
    
    
       static String content= "";

    public  Reader() throws IOException {
    
        System.out.println("Enter text file path including name and extension");
        
        Scanner sc = new Scanner(System.in);
    
        String select = sc.nextLine();
        String fileName = select; 
            StringBuilder sb = new StringBuilder();
    
        String line = "";

        try {
            FileReader fileReader = new FileReader(fileName);
// C:\Users\aodhan\Documents\NetBeansProjects\four-square\src\ie\gmit\sw\pob.txt
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println("");
                sb.append(line);
            }   
                content = sb.toString();
                
                content = content.replaceAll("[^a-zA-Z]", "").toUpperCase();
                
                System.out.println(content);

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
        
    }
}