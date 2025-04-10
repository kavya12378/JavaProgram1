package Java_Program;

public class methodoverloading {
    static int method(int a, int b)
    {
        return a + b;
    }
    double method(double a, double b)
    {
        return a + b;
    }
    public static void main(String[] args) {
        int sum1 = method(5, 4);
        methodoverloading obj = new methodoverloading();

        int sum2 = obj.method(5.4, 2.5);
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of two double: " + sum2);
}
}
