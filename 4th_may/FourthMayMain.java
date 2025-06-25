
import java.util.Scanner;
public class FourthMayMain {
  public static void main(String[] args) {
    try(Scanner scan = new Scanner(System.in)){
        System.out.println("Enter the two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        FourthMayFunc function = new  FourthMayFunc();

        System.out.println("(a+b)^2 = " + function.sqaurePlusMethod(a, b));
        System.out.println("(a-b)^2 = " + function.sqaureMinusMethod(a, b));
        System.out.println("(a+b)^3 = " + function.cubicWholePlusMethod(a, b));
        System.out.println("(a-b)^3 = " + function.cubicWholeMinusMethod(a, b));
        System.out.println("(a^3+b^3) = " + function.cubicPlusMethod(a, b));
        System.out.println("(a^3-b^3)= " + function.cubicMinusMethod(a, b));
     
    }
  }  
}
