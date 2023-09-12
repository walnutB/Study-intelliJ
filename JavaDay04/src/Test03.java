public class Test03 {
    public static void main(String[] args) {
//        - 아래와 같은 배열일 때 각 행의 마지막 열에 행의 합을 저장되도록 하고 전체 배열을 출력하기
//        - int[ ][ ] a= {{1,2,3,0},
//                {4,5,6,0},
//                {7,8,9,0}};
//        - [출력결과]
//        1 2 3 6
//        4 5 6 15
//        7 8 9 24

        int[ ][ ] a= {{1,2,3,0},
                {4,5,6,0},
                {7,8,9,0}};

        for ( int i = 0 ; i < a.length ; i++ ){

            for ( int j = 0 ; j < a .length ; j++ ){

                a [ i ] [ 3 ] += a [ i ] [ j ];

            }

        }

        for ( int i = 0 ; i < a.length ; i++ ){

            for ( int j = 0 ; j < a [ 0 ].length ; j++ ){

                System.out.print( a [ i ] [ j ] + " " );

            }

            System.out.println();

        }


    }
}
