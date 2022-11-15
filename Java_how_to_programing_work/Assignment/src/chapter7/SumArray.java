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
public class SumArray {
    
    public static void main(String[] args){
        
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        
        for(int counter = 0; counter <array.length; counter++){
            
            total+=array[counter];
        }
        
        System.out.println("Total of array elements : "+total);
    }
    
}
