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
public class BarChart {
    
    public static void main(String[] args){
        
        int[] array = {1,2,3,4,5,6,5,4,3,2,1};
        
        System.out.println("Grade Distribution : \n");
        
        for(int counter = 0; counter < array.length; counter++){
            
            if(counter == 10){
                System.out.printf("%5d : ",100);
            }
            
            else{
                System.out.printf("%2d-%2d : ",counter*10,counter*10+9);
            }
            for(int star = 0; star < array[counter]; star++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
    
}
