import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
//        이름, 국어, 영어점수 입력받아 총점, 평균 구하고 평균이 80 이상이면 합격 출력하기
//        단 각 과목의 점수가 60점 이상이어야 함.
        Scanner scan = new Scanner(System.in);
        System.out.println( "이름 입력" );
        String name = scan.next();
        System.out.println( "국어점수" );
        int kor = scan.nextInt();
        System.out.println( "영어점수" );
        int eng = scan.nextInt();
        int tot = kor + eng;
        double ave = tot / 2.0;
        System.out.println( "평균 : " + ave );
        if( kor >= 60 && eng >= 60 && ave >= 80.0){
            System.out.println( "합격" );
        }else {
            System.out.println( "불합격" );
        }
    }
}
