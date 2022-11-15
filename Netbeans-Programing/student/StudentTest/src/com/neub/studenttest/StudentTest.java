
package com.neub.studenttest;

/**
 *
 * @author User
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        StudentFrame studentFrame = new StudentFrame();
        
        
        Student student = new Student("Karim", "Vai", "CSE", "01725689411", 35);
        
        String firstName;
        String lastname;
        String fullName;
        
        firstName = student.getFirstName();
        lastname = student.getLastName();
        
        fullName = firstName + " " + lastname;
        
        System.out.println("Full Name: "+fullName);
        
        student.setLastName("Miah");
        
        firstName = student.getFirstName();
        lastname = student.getLastName();
        
        fullName = firstName + " " + lastname;
        
        System.out.println("Full Name: "+fullName);
         
    }
    
}
