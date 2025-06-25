
import java.util.Scanner;
 public  class FactorialNumber {
    public static  int factorialNumber(int number)
    {
        if(number ==0)
        {
            return 1;
        }
        return number*factorialNumber(number-1);
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Factorial is : "+ factorialNumber(n));

        sc.close();
    }
    
}
