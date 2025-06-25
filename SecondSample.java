public class SecondSample {
    public static void main(String[] args) {
        // System.out.println("Total: " + (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
        int total =0;
        for (String arg : args) {
            
            total += Integer.parseInt(arg);
        }
        System.out.println("Data:\n" + total );
   
    }
}
