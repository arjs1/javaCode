// An array with an odd number of elements 
// is said to be centered if all elements (except the middle one) 
// are strictly greater than the value of the middle element. Note that 
// only arrays with an odd number of elements have a middle element. 
// Write a function that accepts an integer array and returns 1 if it is a
//  centered array, otherwise it returns 0.

public class CenteredArray {
    public  int checkCentered(int a[])
    {
        if(a.length % 2 == 0)
        {
            return 0;
        }
        int middleElementIndex = (a.length)/2;
        for (int i = 0; i < a.length; i++) {
            if(i != middleElementIndex && a[i]<= a[middleElementIndex]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        CenteredArray array1 = new CenteredArray();
        int[] a =  {40,50,90,60,70}; 
      int result =  array1.checkCentered(a);
        if(result == 1)
        {
            System.out.println("successfull");
        }
        else{
            System.out.println("Unsuccessful");
        }
    }
}
