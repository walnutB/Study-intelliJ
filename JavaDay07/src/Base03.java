class AA{
    private int a;
    public AA( int a ){
        this.a = a;
    }
    public int getA() {
        return a;
    }
}
class BB extends AA {
    private int b;
    public BB( int a, int b ){
        super( a ); // 부모생성자 호출하기
        this.b = b;
    }
    public int getB() {
        return b;
    }
}
public class Base03 {
    public static void main(String[] args) {
//        AA a = new AA( 3 );
//        System.out.println( a.getA() );
        BB b = new BB( 5, 10 );
        System.out.println( b.getA() + ", " + b.getB());
    }



}
