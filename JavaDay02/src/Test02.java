import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
//        국어,영어점수를 입력받아 과목의 총점,평균,학점 구하기
        Scanner scan = new Scanner( System.in );
        System.out.println( "국어점수 입력" );
        int kor = scan.nextInt();
        System.out.println( "영어점수 입력" );
        int eng = scan.nextInt();
        int tot = kor + eng;
        double ave = tot / 2.0;
        char hak = ' ';
        if( ave >= 90){
            hak = 'A';
        } else if ( ave >= 80) {
            hak = 'B';
        } else if ( ave >= 70) {
            hak = 'C';
        } else if ( ave >= 60) {
            hak = 'D';
        }else {
            hak = 'F';
        }
        System.out.println( "총점 : " + tot + ", 평균 : " + ave + ", 학점 : " + hak );
    }
}
