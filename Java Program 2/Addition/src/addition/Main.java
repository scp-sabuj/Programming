package addition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1,num2,sum;
        System.out.print("Enter the first number:");
        num1 = input.nextInt();
        System.out.print("Enter the second number:");
        num2 = input.nextInt();
        
        sum = num1+num2;
        
        System.out.println("Sum of the two number is : "+sum);
        
        sum = num1-num2;
        
        System.out.println("Sum of the two number is : "+sum);
        
        sum = num1*num2;
        
        System.out.println("Sum of the two number is : "+sum);
        
        sum = num1/num2;
        
        System.out.println("Sum of the two number is : "+sum);
        
        sum = num1%num2;
        
        System.out.println("Sum of the two number is : "+sum);
        
        
    }
    
}
