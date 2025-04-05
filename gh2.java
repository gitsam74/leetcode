2. Write a java program to create a student class which has two data members. Create an object by new keyword and print the obhect's value.

 Object & Class 
Example : main within the class (no initialised)

package test;
public class Student {
int no;
String name;

public static void main (String[] args){
Student S1 = new Student ();

System.out.println(S1.no);
System.out.println(S1.name);
      }
}