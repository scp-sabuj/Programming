/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author F.C
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String in;
        Scanner input = new Scanner(System.in);
        in = input.nextLine();
        
        String firstN = "";
        String lastN = "";
        
        String[] str = in.split( " ");
        
        System.out.println(str[0]);
        System.out.println(str[1]);
        
        String s = str[0].substring(0, 1).toUpperCase()+str[0].substring(1, str[0].length());
        System.out.println(s);
        
        String nm = "sabuj Paul";
        
        boolean check = isInteger(nm);
        
        if(check== true){
            JOptionPane.showMessageDialog(null, "This Is Integer..");
        }else{
            JOptionPane.showMessageDialog(null, "This Is not Integer..");
        }
        
    }

    private static boolean isInteger(String nm) {
        try{
           Integer.parseInt(nm);
           return true;
        }catch(NumberFormatException e ){
            return false;
        }
         
    }
    
    
}
