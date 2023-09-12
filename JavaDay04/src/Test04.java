public class Test04 {

    public static void main(String[] args) {

//        - 마지막 행에 각 열의 합이 저장되도록 하고 전체 배열을 출력하기
//                - int[][] a= {{1,2,3,
//                {4,5,6},
//                {7,8,9},
//                {0,0,0}};
//        - 출력결과:
//        - 1 2 3
//        4 5 6
//        7 8 9
//        12 15 18

        int[][] a= { {1,2,3},
                {4,5,6},
                {7,8,9},
                {0,0,0} };

        for ( int i = 0 ; i < 3 ; i++ ){

            for ( int j = 0 ; j < 3 ; j++  ){

                a [ 3 ] [ j ] += a [ i ] [ j ];

            }

        }

        for ( int i = 0 ; i < a.length ; i++ ){

            for (int j = 0 ; j < a [ 0 ].length ; j++ ){

                System.out.print( a [ i ] [ j ] + " " );

            }

            System.out.println();

        }


    }

}
