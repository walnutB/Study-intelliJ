public class Test07 {

//    - Book객체를 5개 배열로 생성하고 값 저장하고 출력되도록 하기
//    - Book 클래스는 T-05에서 생성한 것을 사용한다.

    public static void main(String[] args) {

        Book[] b = new Book [ 5 ];
        b [ 0 ] = new Book( "Java", 5000 );
        b [ 1 ] = new Book( "Spring", 4000 );
        b [ 2 ] = new Book( "JSP", 3000 );
        b [ 3 ] = new Book( "Vue.js", 7000 );
        b [ 4 ] = new Book( "Node.js", 8000 );

        for ( int i = 0 ; i < b.length ; i++ ){

            b [ i ].showInfo();

        }

    }


}
