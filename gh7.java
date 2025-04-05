7. Write a java program to create a constructor and initialize the value of the variable inside the constructor

Parameterized Constructor

package test;
class ConMethod {
String name;
ConMethod (String n) {
name = n;
System.out.println ('I am no parameterized constructor");
}
public static void main (String[] args){
ConMethod Obj= new ConMethod("ECS");
System.out.println ("Branch is"+ Object.name);
System.out.println ("obj.ConMethod");
      }
}