package takeinformationandout;

import java.util.Scanner;

public class TakeInformationandOut {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name = "Sabuj";
        int age = 21;
        double gpa = 3.9;
        
        System.out.print("Enter the student's name:");
        name = input.nextLine();
        System.out.print("Enter the student's age:");
        age = input.nextInt();
        System.out.print("Enter the student's gpa:");
        gpa = input.nextDouble();
        
        
        
        System.out.printf("%s is %d years old.%s has %4.3f gpa.\n",name,age,name,gpa);
    }
    
}
