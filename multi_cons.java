package Java_Program;

public class multi_cons {
    int n1;
    int n2;
    public multi_cons(){
        n1=10;
        n2=20;
        System.out.println("No parameter constructor");
        public multi_cons(int n, int m)
        {
            n1=n;
            n2=m;
            System.out.println("parameter constructor");
        }
        public static void main(String[] args){
            multi_cons obj1=new multi_cons();
            multi_cons obj2=new multi_cons(10,20);
            System.out.println(obj1.n1);
            System.out.println(obj1.n2);
            System.out.println(obj2.n1);
            System.out.println(obj2.n2);
        }
    }
}
