import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        학생의 이름, 국어, 영어점수를 입력받아 총점과 평균 구해서 출력하기
        Scanner scan = new Scanner(System.in);
        System.out.println( "이름 입력" );
        String name = scan.next();
        System.out.println( "국어점수" );
        int kor = scan.nextInt();
        System.out.println( "영어점수" );
        int eng = scan.nextInt();
        int tot = kor + eng;
        double ave = tot/2.0;
        System.out.println( "이름 : " + name);
        System.out.println( "총점 : " + tot );
        System.out.println( "평균 : " + ave );

    }
}
