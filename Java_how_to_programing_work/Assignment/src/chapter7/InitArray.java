/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7;

/**
 *
 * @author REZAUL KARIM
 */
public class InitArray {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array;
        array = new int[10];
        System.out.printf("%s%8s\n" , "Index" , "Value");
        
        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%5s%8s\n", counter, array[counter]);
        }
    }
}
