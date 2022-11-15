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
public class GradeBookTest {
    public static void main(String[] args) {
        
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        
        GradeBook myGradeBook = new  GradeBook("CS101 Introduction to Java Programming", gradesArray);
        
        myGradeBook.displayMessage();
        
        myGradeBook.processGrades();
    }
}
