package randomswitch;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int ran;
        int f1=0;
        int f2=0;
        int f3=0;
        int f4=0;
        int f5=0;
        int f6=0;
        System.out.println("case no\tfrequency");
        Random ranNum = new Random();
        
        for(int i=1;i<=20;i++){
            ran = ranNum.nextInt(3);
        
            switch(ran){
            
                case 1:
                    ++f1;
                    break;
                case 2:
                    ++f2;
                    break;
                case 3:
                    ++f3;
                    break;
                case 4:
                    ++f4;
                    break;
                case 5:
                    ++f5;
                    break;
                case 6:
                    ++f6;
                    break;
                default:
                    break;
                
        }
        int f=f1|f2|f3|f4|f5|f6;
        System.out.printf("%d\t%d\n",ran,f);
        }
    }
    
}
