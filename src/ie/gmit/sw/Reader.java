package ie.gmit.sw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    
    Scanner sc = new Scanner(System.in);
    
    String select = sc.next();
    File file = new File("PoblachtNaHEireann.txt");
    //File file = new File("PoblachtNaHEireann.txt");

    public Reader() {
    
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    
    
    }
}
