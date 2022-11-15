/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author F.C
 */
public class Sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int a,b,temp;
//        System.out.println("Enter the numbers : ");
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        temp = a+b;
//        System.out.println("Sumation of two numbers is : "+temp);
//        temp = a-b;
//        System.out.println("Subtration of two numbers is : "+temp);
//        temp = a*b;
//        System.out.println("Multiplicatin of two numbers is : "+temp);
//        temp = a/b;
//        System.out.println("Division of two numbers is : "+temp)
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");

        String tD = ft.format(dNow);
        System.out.println("This is today date :" + tD);

    }
}
