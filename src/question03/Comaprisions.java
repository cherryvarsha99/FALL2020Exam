/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.awt.Rectangle;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class Comaprisions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle box1 = new Rectangle(10,20,10,10);
Rectangle box2 = new Rectangle(10,20,10,10);
Rectangle box3 = box1;
Rectangle box4;
// here we are comparing  box1 object and box2 object since bothe refers to 2 different objects we get false
System.out.println(box1 == box2);
// we are comparing contents of box1 with box2 and since both object values are same we get true
System.out.println(box1.equals(box2));
// we are comparing box2 object with box3 and since both referes to different  objects we get fasle
System.out.println(box2 == box3);
// we are comparing box 2 contents with box3 since box1 and 3 are same and has same values as box2 we get true
System.out.println(box2.equals(box3));
// we are comparing box1 object with box 3 both refers to same object hence we get true
System.out.println(box1==box3);
// we are creating new object refrence for box3 
box3 = new Rectangle(10,20,10,10);
// comapring box1 object with box 3 now box3 refers to different object and we get false
System.out.println(box1==box3);
// comparing box1 values with box3 we get true since box 1 and box 3 values are same 
System.out.println(box1.equals(box3));

String s1 = new String("Java");
String s2 = s1;
String s3 = new String(s2);
String s4 = "Java";
//comparing string reference here s1 and s2 refers same object hence we get true
System.out.println(s1 == s2);
//comapring s1 value with s2 since both refers to same object values are same and we get true
System.out.println(s1.equals(s2));
//comparing s1 object reference with s3 both refers to different objects we get false
System.out.println(s1 == s3);
// comparing s1 values with s3 and both values are same we get true
System.out.println(s1.equals(s3));
// comparing s1 object reference with s4 and  here s4 not created with new it refers to s3 hence we get true
System.out.println(s1 == s4);
// comparing s1 value with s4 both are same hence we get true
System.out.println(s1.equals(s4));
//comparing s2 object reference with s3  both refers to different objects and we get false
System.out.println(s2 == s3);
// comparing s2 value with s3 and both are same hence we get true
System.out.println(s2.equals(s3));
//comapring s2 object reference with s4 bot are different and we get false
System.out.println(s2 == s4);
//comapring s2 values with s4 and both are same hence we get true
System.out.println(s2.equals(s4));
//comapring s3 object reference with s4 and both are different hence we get false
System.out.println(s3 == s4);
//comapring s3 values with s4 and both values are same hence we get true
System.out.println(s3.equals(s4));

    }
    
}
