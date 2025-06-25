
import java.util.Scanner;

public class ThirdSample {
    public   int  returnSquare(int a, int b)
    {
     
       return a*a+2*a*b+b*b; 
    }
    public  static  void main(String [] args){
         ThirdSample third = new  ThirdSample();
         System.err.println("Enter the number a & b:");
        try (Scanner sc = new  Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + third.returnSquare(a, b));
        }
    }
}
