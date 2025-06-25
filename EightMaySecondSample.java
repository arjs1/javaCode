public class EightMaySecondSample {
    // this main method is for reverse
    // public static void main(String[] args) {
    //     int[] array1 = {1,2,3,4,5};
    //     int[] array2 = new int[array1.length];
    //     int j=0;
    //     for (int i = array1.length-1; i >= 0; i--) {
    //         array2[j]=array1[i];
    //         j++;
    //     }
    //     display(array1);
    //     display(array2);
    // }
    public static  void display(int[]number)
    {
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
    // this main method is for addition
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        int[] array2={1,2,3,4,5};
        int[] sumArray= new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            sumArray[i]=array1[i]+array2[i];
        }
        display(sumArray);
    }
}   


