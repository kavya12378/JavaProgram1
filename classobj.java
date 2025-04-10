package Java_Program;

public class classobj {
    public int add(int a, int b) {
        System.out.println(a+b);
        return 0;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        classobj obj = new classobj();
        obj.add(num1, num2);
    }
}  