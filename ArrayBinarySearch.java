
import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        
        int[] numbers = {3,4,5,6,7,12,34,90};
        Arrays.sort(numbers);
       ArrayPrint.printFunc(numbers);
        int index = Arrays.binarySearch(numbers, 34);
        if(index>=0)
        {
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element Not found ");
        }
    }
}
