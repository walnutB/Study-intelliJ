package Array;

public class Base02 {
    public static void main(String[] args) {
        int[ ] c = new int [ 5 ]; // 배열의 초기화(기본 0값)
        for ( int i = 0 ; i < 5 ; i ++ ){
            System.out.println( c [ i ] );
        }

//        int[ ] d = new int [ ] { 1, 2, 3, 4, 5 }; // 배열 초기값을 지정할 수 있음
        int[ ] d = { 1, 2, 3, 4, 5 }; // 초기값 지정 시 new int[] 생략가능
        for ( int i = 0 ; i < 5 ; i ++ ){
            System.out.println( d [ i ] );
        }
    }
}
