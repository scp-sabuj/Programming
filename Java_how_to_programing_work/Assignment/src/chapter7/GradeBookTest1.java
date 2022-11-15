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
public class GradeBookTest1 {

    public static void main(String[] args) {

        int[][] gradesArray = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}};

        GradeBook1 myGradeBook = new GradeBook1("cs101 introduction to java programming", gradesArray);

        myGradeBook.displayMessage();

        myGradeBook.processGrades();
    }

}
