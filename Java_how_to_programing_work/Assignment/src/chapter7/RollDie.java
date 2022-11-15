/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

import java.util.Random;

/**
 *
 * @author REZAUL KARIM
 */
public class RollDie {

    public static void main(String[] args) {

        int[] frequency = new int[7];
        Random randomNumber = new Random();

        int index = 0;

        System.out.printf("%s%11s\n", "Face", "Frequency");

        for (int counter = 0; counter < 6000000; counter++) {

            ++frequency[ 1 + randomNumber.nextInt(6)];
        }
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d\n", face, frequency[ face]);
        }
    }

}
