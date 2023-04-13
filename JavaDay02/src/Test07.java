import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
//        국어,영어점수를 입력받아 과목의 총점,평균,학점 구하기 - switch
//        학점은 평균점수로 구한다.
//        평균이 90이상이면 학점 A
//        평균이 80이상이면 학점 B
//        평균이 70이상이면 학점 C
//        평균이 60이상이면 학점 D
//        평균이 60미만이면 학점 F
        Scanner scan = new Scanner( System.in );
        System.out.println( "국어점수입력" );
        int kor = scan.nextInt();
        System.out.println( "영어점수입력" );
        int eng = scan.nextInt();
        int tot = kor + eng;
        double ave = tot / 2.0;
        char hak = ' ';
        int p = (int) ave / 10;
        switch (p){
            case 10 :
            case 9 : hak = 'A';break;
            case 8 : hak = 'B';break;
            case 7 : hak = 'C';break;
            case 6 : hak = 'D';break;
            default: hak = 'F';
        }
        System.out.println( "총점 : " + tot + "평균 : " + ave + "학점 : " + hak );
    }
}
