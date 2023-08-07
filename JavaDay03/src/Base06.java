import java.util.Scanner;
public class Base06 {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int tot=0;
//        int[] sn = new int[5];
//        for(int i=0; i<5; i++) {
//            System.out.println( ( i + 1) + "번 학생 점수 입력");
//            sn[i] = scan.nextInt();
//            tot += sn[i];
//        }
//        for ( int b = 0; b < 5 ; b++ ){
//            System.out.print( (  b  + 1) + "번 점수 : " + sn[ b ] + " " );
//        }
//        System.out.println();
//        System.out.println("전체총점: "+tot);
//        System.out.println("전체평균: "+(tot/5.0));
        Scanner scan=new Scanner(System.in);
        int[] b = new int[5];
        int tot=0;
        for(int i=0; i<5; i++) {
            System.out.println( ( i + 1) + "번째 학생 점수 입력");
            b[i]=scan.nextInt();
            tot+=b[i];
        }
        System.out.println("<<입력된 학생 점수>>");
        for(int i=0;i<5;i++) {
            System.out.println(b[i]);
        }
        System.out.println("전체총점: "+tot);
        System.out.println("전체평균: "+(tot/5.0));
    }
}
