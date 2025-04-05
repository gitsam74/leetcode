 Object & Class
Example : main within the class (initialisation by reference variable)

package text;
public class student{
int no;
String name;

public static void main (String[] args){
Student S1 = new Student ();
S1.no = 56;
S1.name = "Sam";
System.out.println(S1.no);
System.out.println(S1.name);
     }
}