import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
//        학생번호/이름/국어점수/수학점수를 입력받아 각 과목이 60이상이고 평균이 75점 이상이면
//        합격 아니면 불합격이라고 출력되도록 해보세요
        Scanner scan = new Scanner(System.in);
        System.out.println( "번호입력" );
        int num = scan.nextInt();
        System.out.println( "이름 입력" );
        String name = scan.next();
        System.out.println( "국어점수 입력" );
        int kor = scan.nextInt();
        System.out.println( "수학점수 입력" );
        int mat = scan.nextInt();
        double ave = ( kor + mat ) / 2.0;
        System.out.println( "평균 : " + ave );
        if( kor >= 60 && mat >= 60 && ave >=75){
            System.out.println( "합격" );
        }else {
            System.out.println( "불합격" );
        }


    }
}
