package Java_Program;

public class staticmethod {
    int usn;
    String name;
    static String sub;
    staticmethod(int usn , String name)
    {
        this.usn=usn;
        this.name=name;
    }
    static{
        sub="java";
    }
    void display(){
        System.out.println("USN : "+usn + "name:" +name+ "sub :" +sub);
    }
    public static void main(String[] args) {
        staticmethod s1=new staticmethod(1,"sai");
        staticmethod s2=new staticmethod(2,"abc");
        s1.display();
        s2.display();
}
}