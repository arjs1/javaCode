
public class FourthMayFunc {
    public int sqaurePlusMethod(int a, int b)
    {
        return a*a+(2*a*b)+b*b;
    }
    public int sqaureMinusMethod(int a, int b)
    {
        return a*a-(2*a*b)+b*b;
    }
    public int cubicWholePlusMethod(int a,int b)
    {
        return (((int)Math.pow(a, 3))+3*a*a*b+3*a*b*b+((int)Math.pow(b, 3)));
    }
    public int cubicWholeMinusMethod(int a,int b)
    {
        return (((int)Math.pow(a, 3))-3*a*a*b+3*a*b*b+((int)Math.pow(b, 3)));
    }
    public int cubicPlusMethod(int a , int b){
        return  ((a+b)*(a*a+b*b-a*(b)));
    }
    public int cubicMinusMethod(int a , int b){
        return  ((a-b)*(a*a+b*b-a*(b)));
    }
    
}
