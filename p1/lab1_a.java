package p1;
import java.util.*;
public class lab1_a 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean cont_calc = true;
        String history = "";
        while (cont_calc) 
        {
            System.out.println("Enter the operand 1:");
            double a = sc.nextDouble();
            System.out.println("Enter the operator:");
            char c = sc.next().charAt(0);
            System.out.println("Enter the operand 2:");
            double b = sc.nextDouble();
            double res = 0;
            if (a > 0 && b > 0) 
            {
                switch (c) 
                {
                    case '+':
                        res = a + b;
                        break;
                    case '-':
                        res = a - b;
                        break;
                    case '*':
                        res = a * b;
                        break;
                    case '/':
                        if (b != 0)
                            res = a / b;
                        else
                            System.out.println("divisior can not be zero");//
                        break;
                    default:
                        System.out.println("Invalid operator");///
                        break;
                }
                if (res > 0) 
                {
                    history += "" + a + c + b + "=" + res + "\n";//
                    System.out.println("" + a + c + b + "=" + res);//
                }
            } 
            else
                System.out.println("Enter only positive numbers");//
            System.out.println("Do you want calculate once again(Enter yes to continue and no to stop)");//
            String input = sc.next();
            if (input.equalsIgnoreCase("yes"))
                cont_calc = true;
            else 
                cont_calc = false;
        }
        System.out.println("Do you want to print the history:");//
        String input1 = sc.next();
        if (input1.equalsIgnoreCase("yes"))
           System.out.println(history);
        sc.close();
    }
    
}
