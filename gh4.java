Object & Class
Example : main outside the class

packge load;
public class student{
int no;
String name;
}
public class MainStudent {
public static void main (String[] args){
Student S1 = new Student ();
S1.no = 22;
S1.name = "Sam";
System.out.println(S1.no);
System.out.println(S1.name);
     }
}