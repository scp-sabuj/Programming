package stringinout;

import java.util.Scanner;

public class Main {
    
    void displayMessage(String s1){
        String s2=s1;
        System.out.println("Welcome to course "+s2+" again.");
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the course name:");
        String s1 = input.nextLine();
        System.out.println("Welcome to course "+s1+".");
        
        Main obj = new Main();
        obj.displayMessage(s1);
    }
    
}
