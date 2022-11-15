package randomint;

import java.util.Random;

public class RandomInt {

    public static void main(String[] args) {
        
        int ran;
        
        Random randomNumbers = new Random();
        
        for(int i=1; i<=20;i++){
            
            ran =randomNumbers.nextInt(6);
        
            System.out.printf("%d ", ran);
            
            if(i%5==0)
            {
                System.out.printf("\n");
            }
        }
    }
    
}
