package ie.gmit.sw;

public class Encrypt {
    
public static char[] lettersArray = "ABCDEFGHIKLMNOPQRSTUVWXYZ".toCharArray();

public static char[][] polySquare1 = new char[5][5];
public static char[][] polySquare2 = new char[5][5];
public static char[][] polySquare3 = new char[5][5];

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
    int num = 0;
    
    String[] bigrams = new String[text.length() / 2];
    
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
                if(conv[i][j] == transform[0] || conv[i][j] == transform[1]){
                    System.out.println("x: " + i  + " y: " + j + " value " + transform[z] + " converted value: " + conv[i][j]);
                    //finds matching chars and gives their index in cchar arrays
                    z++;
                }
                }   
            }
    // O(n^4) time nested for loops and 2 if statements
    }    return conv;
    }

public static String encrypt2(String plaintext, String keyword1, String keyword2) {
    String[] pairs = bigram(plaintext);
    char first, second;
    int xFirst = 0, yFirst = 0, xSecond = 0, ySecond = 0;
    StringBuilder ciphertext = new StringBuilder();
    for (String s : pairs) {
        first = s.charAt(0);
        second = s.charAt(1);
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if (polySquare3[x][y] == first) {
                    xFirst = x;
                    yFirst = y;
                } else if (polySquare3[x][y] == second) {
                    xSecond = x;
                    ySecond = y;
                }
            }
        }
        ciphertext.append(polySquare1[xSecond][yFirst]).append(polySquare2[xFirst][ySecond]);
    }
    return ciphertext.toString();
}

public static char[][] decrypt(char[][] answer, String input) {
    //ran out of time here but i'm pretty sure i've to get the inverse of the indexs above
    //finds matching chars in a char[][] which will be one of the polybius squares 
    //and a string which will be the key converted to a char array below
    
    //counter
    int z = 0;
    //convert inputted string to char array
    char[] transform = input.toCharArray(); 
    while(z <50){
    for(int i = 0; i < 5; i++){
             for(int j = 0; j < 5; j++){
                if(transform[0] == answer[i][j]||transform[1] == answer[i][j]){
                    System.out.println("x: " + i +1  + " y: " + j +1 + " value " + transform[z] + " converted value: " + answer[i][j]);
                    //finds matching chars and gives their index in cchar arrays
                    z++;
                    if(z % 2 ==0){
                        i=0;
                        j=0;
                    }
                    
                }
                }   
            }
    // O(n^4) time nested for loops and 2 if statements
    }    return answer;
    }

}