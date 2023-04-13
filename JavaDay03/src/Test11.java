public class Test11 {
    public static void main(String[] args) {
//        1부터 100까지 수를 한줄에 10개씩 출력하기. → do~while문 사용
        int i = 1;
        do {

            System.out.print( i + " " );
            if ( i % 10 == 0 ) System.out.println();
            i++;
        } while ( i <= 100 );
    }
}
