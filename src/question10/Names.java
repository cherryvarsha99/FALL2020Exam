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
    public Names(int studentAgeIn, String studentNameIn, String studentLastNameIn) {
        studentAge = studentAgeIn;
        studentName = studentNameIn;
        studentLastNameIn = studentLastNameIn;

    }
       //created same constructor but  with 2 parameters and when we call object  with 2 parameters the to String will return this constructor values 

    public Names(int studentAgeIn, String studentNameIn) {
        studentAge = studentAgeIn;
        studentName = studentNameIn;

    }
        // created  same constructor but  with one  parameter and when object with  parameter to string will return this conctructor  values

    public Names(int studentAgeIn) {
        studentAge = studentAgeIn;

    }

    
    // method age with one parameter
    public int age(int a)
    { 
        return 10; 
    } 
  // created same method but  with two parameter of integer and char variables . we cannot create same method with same number of params but with different no of params
    public char age(int a, char b) 
    { 
        return 'V'; 
    } 
    // // create method  age with 3 parameters a,,b,c . hence when we create object for this class and call age () with specific number of parameters then that age() will be called 
    public int  age(int a, int c,int d)
    { 
        return 10; 
    } 
    
    
} 





