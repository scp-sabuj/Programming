package takeinformationandout2;

import java.util.Scanner;

public class TakeInformationandOut2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = "",heshe = "";
        int age;
        double gpa;
        boolean isFemale;
        
        System.out.print("Enter the student's name:");
        name  = input.nextLine();
        System.out.print("Enter the student's age:");
        age  = input.nextInt();
        System.out.print("Enter the student's gpa:");
        gpa  = input.nextDouble();
        System.out.print("Are you Female? (true/false)");
        isFemale  = input.nextBoolean();
        
        heshe =isFemale ? "She" : "He";
        
        System.out.printf("%s is %d years old.%s has %4.3f gpa.\n",name,age,heshe,gpa);
    }
}