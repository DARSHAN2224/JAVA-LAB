package p1;
//import java.math.*;
class ShapeAC 
{
	 ShapeAC(int r) 
	 {
	     System.out.println("A circle is created");
	     System.out.println("Area of circle which was created is " + (Math.PI * r * r) + "cm2");
	 }
	
	 ShapeAC(int l, int b) 
	 {
	     System.out.println("A Rectangle is created");
	     System.out.println("Area of rectangle which was created is " + (l * b) + "cm2");
	 }
}

public class Lab2_b 
{
 public static void main(String[] args) 
 {
     new ShapeAC(5);
     new ShapeAC(3, 4);
 }
}
