package ie.gmit.sw;

public class Encrypt {
    
public static char[] lettersArray = "ABCDEFGHIKLMNOPQRSTUVWXYZ".toCharArray();

public static char[][] polySquare1 = new char[5][5];
public static char[][] polySquare2 = new char[5][5];

public static char[][] fillchar(char[][] filled) {
    //fills char array with letters
    
    int x = 0;
    for(int i = 0; i < 5; i++){
             for(int j = 0; j < 5; j++){
                filled[i][j] = lettersArray[x];
                x++;
                }   
            }
    // O(n^2) time nested for loops
    return filled;
    }
public static String[] bigram(String text) {
    //checks that text is even length, if not adds x to end
    if (text.length() % 2 != 0) {
        text = text + "X";
    }
    String[] bigrams = new String[text.length() / 2];
    int num = 0;
    for (int i = 0; i < (text.length() / 2); i++) {
        bigrams[i] = text.substring(num, num + 2);
        num = num + 2;
    }
    // O(n) time
    return bigrams;
    }

public static char[][] convertChar(char[][] conv, String input) {
    //finds matching chars in a char[][] which will be one of the polybius squares 
    //and a string which will be the key converted to a char array below
    
    //counter
    int z = 0;
    //convert inputted string to char array
    char[] transform = input.toCharArray(); 
    if(z <2){
    for(int i = 0; i < 5; i++){
             for(int j = 0; j < 5; j++){
                if(transform[z] == conv[i][j]){
                    System.out.println("x: " + i + " y: " + j);
                
                z++;
                }
                }   
            }
    // O(n^3) time nested for loops and if
    }    return conv;
    }

}