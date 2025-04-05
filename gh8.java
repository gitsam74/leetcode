9. Write a java constructor to print perimeter of circle

package test;
import java.util.scanner;
class PerimeterOfCircle {
double Peri;
Peri (double r) {
Peri = (2*3.14*r);
      }
}
class PeriFind {
public static void main (String[] args){ 
Scanner S = new Scanner (System.in);
System.out.println ("Enter the radius");
double rad = S.nextDouble();
Peri a = new Peri (rad);
 System.out.println ("Perimeter of circle is"+a.Peri);
     }
}