package com.neub.studenttest;

/**
 *
 * @author CSE 200 5th Semester
 * @version 1.0 
 * @date 18 May 2016
 * 
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private String department;
    private String mobile;
    private int studentAge;
    
    /**
     * 
     * @param firstName
     * @param lastName
     * @param department
     * @param mobile
     * @param age 
     */
    public Student(String firstName, String lastName, 
            String department, String mobile, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.mobile = mobile;
        this.studentAge = age;
    }
    /***
     * 
     * @param firstName
     * @param lastName
     * @param department 
     */
    public Student(String firstName, String lastName, 
            String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getMobile() {
        return mobile;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

}
