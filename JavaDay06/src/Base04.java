class MyClass{
    private int a; // 인스턴스변수
    private static int b; // static 멤버변수
    public MyClass(){
        a++;
        b++;
    }
    public void print(){
        System.out.println( "a: " + a );
        System.out.println( "b: " + b );
    }
    public static int getB(){
        return b;
    }
}
public class Base04 {
    public static void main(String[] args) {
        MyClass ob1 = new MyClass();
        ob1.print();
        MyClass ob2 = new MyClass();
        ob2.print();
        MyClass ob3 = new MyClass();
        ob3.print();
    }
}
