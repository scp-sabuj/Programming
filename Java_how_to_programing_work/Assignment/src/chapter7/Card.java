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
public class Card {

    public static void main(String[] args) {
        Card card = new Card("Nice", "Beautiful");

        System.out.println(card);
    }

    private String face;
    private String suit;

    public Card(String cardFace, String cardSuit) {

        face = cardFace;
        suit = cardSuit;
    }

    public String toString() {
        return face + " & " + suit;

    }
}
