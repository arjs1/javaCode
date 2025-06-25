public class MethodOverloading {
    public static void area(int a,int b)
    {
        System.out.println("Area of Rectangle : " + a*b);
    }
    public static void area(float a)
    {
        System.out.println("Area of cricle : " + 3.14*a*a);
    }
    public static void area(double  a,double  b)
    {
        System.out.println("Area of Triangle : " + 0.5*a*b);
    }

    public static void main(String[] args) {
        area(10, 5);
        area(5);
        area(2.5, 3);
    }
}
