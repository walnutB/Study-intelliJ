import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
//        연산자와 if 문을 이용해서 입력된 정수가 짝수인지 홀수인지 나타내기
        Scanner scan = new Scanner(System.in);
        System.out.println( "정수입력" );
        int n1 = scan.nextInt();
        if( n1 % 2 == 0){
            System.out.println( "짝수" );
        }else{
            System.out.println( "홀수" );
        }
//        국어점수와 영어점수를 입력받아 국어 영어가 80점 이상이고
//        평균이 85점 이상인 학생은 합격, 아니면 불합격이 출력되도록 하기
        System.out.println( "국어점수" );
        int kor = scan.nextInt();
        System.out.println( "영어점수" );
        int eng = scan.nextInt();
        double ave = ( kor + eng ) / 2.0;
        System.out.println( "평균 : " + ave );
        if( kor >=80 && eng >=80 && ave >=85 ){
            System.out.println( "합격" );
        }else{
            System.out.println( "불합격" );
        }
    }
}
