package hellonameinport;

import java.util.Scanner;

public class Hellonameinport {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("What is yor name?");
       String yourname = input.nextLine();
       System.out.println("Hello, "+yourname+"!!!");
    } 
}
        