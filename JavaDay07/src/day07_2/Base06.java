package day07_2;
class AA{
    protected int a;
    public AA( int a ){
        this.a = a;
    }
    public void print(){
        System.out.println( "a:" + a );
    }
}
class BB extends AA{
    private int b;
    public BB( int a, int b){
        super( a );
        this.b = b;
    }
    @Override
    public void print(){
        System.out.println( "a:" + a + ", " + b );
    }
    public int getSum(){
        return a + b;
    }

}
public class Base06 {
    public static void main(String[] args) {
        BB bb = new BB( 1, 2 );
        AA aa = bb; // 부모는 자식객체를 참조할 수 있다 -> 자동형변환
        aa.print(); // 자식에서 오버라이딩된 메소드가 호출된다.
//        aa.getSum(); // 자식에서 추가된 멤버는 접근 못함
        BB b1 = ( BB )aa;
        b1.print();

//        AA a =  new AA( 1 );
//        BB b = ( BB )a; // 에러 -> 예외발생
//        System.out.println( b );

//        instanceof 연산자: ~타입의 객체인지 검사
        if( bb instanceof BB ){ //bb가 BB타입의 객체인가?
            System.out.println( "bb는 BB타입입니다." );
        }
        if ( aa instanceof BB ){ //aa가 BB타입의 객체인가?
            System.out.println( "aa는 BB타입입니다." );
        }
        if ( bb instanceof AA ){
            System.out.println( "bb는 AA타입입니다." );
        }
        if ( bb instanceof Object ){
            System.out.println( "bb는 Object타입입니다." );
        }
    }
}
