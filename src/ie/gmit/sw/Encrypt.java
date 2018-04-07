package ie.gmit.sw;

public class Encrypt {
    
    char[] letters = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    char[][] square1,square2,square3,square4 = new char[5][5];
    
    public Encrypt() {
    
    int x = 0;
    
    for (int i = 0; i < 5;i++){
        for (int j = 0; j < 5;j++){
            
               square1[i][j] =  letters[x];
                
               System.out.println(square1[i][j]);
               
               x++; 
        }
    }
    square4 = square1.clone();
    
    
    }
}