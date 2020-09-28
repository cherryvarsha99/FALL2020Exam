/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author S540114
 */
public class Names {

    private int studentAge;
    private String studentName;
    private String studentLAstName;

    // constructor with 3 parameters
    public Names(int studentAgeIn, String studentNameIn, String studentLAstNameIn) {
        studentAge = studentAgeIn;
        studentName = studentNameIn;
        studentLAstName = studentLAstNameIn;

    }
    // constrcutor with 2 parameters

    public Names(int studentAgeIn, String studentNameIn) {
        studentAge = studentAgeIn;
        studentName = studentNameIn;

    }
    // constructor with one  parameter

    public Names(int studentAgeIn) {
        studentAge = studentAgeIn;

    }

    
    // method age with one parameter
    public int age(int a)
    { 
        return 10; 
    } 
  // method int with two parameter
    public char age(int a, char b) 
    { 
        return 'V'; 
    } 
    // method  age with 3 parameters
    public int  age(int a, int c,int d)
    { 
        return 10; 
    } 
    
    
} 





