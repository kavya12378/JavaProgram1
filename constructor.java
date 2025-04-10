package Java_Program;

public class constructor {
    int num1;
    int num2;
    constructor()
    {
        num1 = 5;
        num2 = 10;
        System.out.println("Inside constructor");
    }
    public static void main(String[] args) {
        constructor obj = new constructor();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
    
}
