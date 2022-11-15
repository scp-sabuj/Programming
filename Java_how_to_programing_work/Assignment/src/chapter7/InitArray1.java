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
public class InitArray1 {
    
    public static void main (String[] args){
        
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        
        
        System.out.printf("%s%8s\n","Index","Value");
        
        for(int counter = 0; counter < array.length; counter++){
            
            System.out.printf("%d%8d\n",counter,array[counter]);
        }
    }
}
