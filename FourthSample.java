import java.util.Scanner;

public class FourthSample {
    
    public static void main(String[] args) {
        

         try (Scanner sc = new  Scanner(System.in)) {
             System.out.println("Do you want to add,subtract,multiply,divide? " );
            String operationChoice = sc.nextLine();
            System.out.println("Enter the two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (operationChoice.toLowerCase()) {
                case "add" -> System.out.println("Result: "+ FourthSampleSecond.addMethod(a, b));
                case "subtract" -> System.out.println("Result: "+ FourthSampleSecond.subtractMethod(a, b));
                case "multiply" -> System.out.println("Result: "+ FourthSampleSecond.multiplyMethod(a, b));
                case "divide" -> {
                    if(b!=0)
                    {  System.out.println("Result: " + FourthSampleSecond.divideMethod(a, b));}
                    else
                    {System.out.println("Number can't be divide 0");}
                 }
                default -> System.out.println("Invalid operation choice.");
            }
        }
    }
}
