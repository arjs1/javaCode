
import java.util.Scanner;

public class EightMaySample {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array");
     int lengthArray = sc.nextInt();
     int[] numberArray= new int[lengthArray];
     int evenNumber = 0;
     int oddNumber = 0;
     System.out.println("Enter the array");
     for (int i = 0; i < lengthArray; i++) {
        numberArray [i] = sc.nextInt();
        if(numberArray[i]%2==0)
        {
            evenNumber+=numberArray[i];
        }
        else{
            oddNumber+=numberArray[i];
        }
     }
     

     System.out.println("Total Even Number: "+ evenNumber);
     System.out.println("Total Odd Number: "+ oddNumber);
     sc.close();
    //  for(int i =0;i<lengthArray;i++)
    //  {
      
    //  }

 }
}
