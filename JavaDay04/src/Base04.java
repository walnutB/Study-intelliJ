public class Base04 {
    public static void main(String[] args) {
        /*
         * <2차원 배열>
         * - 첨자가 두개인 배열
         * - 예)
         * 	int[][] a=new int[3],[4]; -> 3행 4열로 배열방이 12개 만들어짐
         */

        int[][] a = { {1,2,3}, //2차원배열, 3개의 배열방을 가진 배열 4개
                {4,5,6},     // 변수명 [가로줄][세로줄]
                {7,8,9},
                {10,11,12} };

        System.out.println( "행크기:"+ a.length );
        //2차원배열에서 lengthf를 쓰면 행의 크기를 보여줌
        System.out.println( "열크기:"+ a[0].length );
        //배열에서 보통 열의 크기는 일정하게 둔다.
        for( int i = 0;i < a.length; i++ ) { //for(int i=0;i<4;i++) { 동일함

            for( int j = 0; j< a[i].length; j++ ) { //for(int j=0;j<3;j++){ 동일함
                System.out.print( a[i][j] + " " );
            }

            System.out.println();
        }
    }
}
