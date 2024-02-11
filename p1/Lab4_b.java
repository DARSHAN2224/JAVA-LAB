package p1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_b{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0,b=0,c=0;
            while (true) {
                try {
                    System.out.println("enter the a value");
                    a = s.nextInt();
                    break;
                } catch (InputMismatchException e1) {
                    System.out.println("enter the number");
                    s.nextLine();
                }
            }
            while (true) {
                
                try {
                    System.out.println("enter the b value");
                    b=s.nextInt();
            
                    try{
                        c = a / b;
                        System.out.println("a/b="+c);
                        break;
                    }
                    catch (ArithmeticException e3) {
                        System.out.println("enter the b value greater than 0");
                    }
                } catch (InputMismatchException e2) {
                    System.out.println("enter a number");
                    s.nextLine();
                }
            }
            s.close();
        }
       
}
