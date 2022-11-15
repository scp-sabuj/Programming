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
public class InitArray2 {
    
    public static void main(String[] args){
        
        final int array_Length = 10;
        
        int[] array = new int[array_Length];
        
        for(int counter = 0; counter < array_Length; counter++){
            
            array[counter] = 2*counter;
        }
        
        System.out.printf("%s%8s\n","Index","Value");
        
        for(int counter = 0; counter < array_Length; counter++){
            
            System.out.printf("%d%8d\n",counter,array[counter]);
        }
    }
    
}
