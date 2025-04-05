Object & Class
Example : Display through method

packge load;
public class student{
int no;
String name;
}
void display () {
System.out.println (no+"    "+name);
}
public static void main (String[] args){
Student S1 = new Student ();
S1.no = 22;
S1.name = "Sam";
S1.display ();
       }
}