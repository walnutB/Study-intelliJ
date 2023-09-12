import java.util.Scanner;

public class Test05 {

    public static void main(String[] args) {

//        - 아이디를 입력받아 해당회원의 이름과 전화번호가 출력되도록 하기
//        - 회원아이디 이름 전화번호
//        admin 김관리 010-111-1234
//        user1 나회원 010-222-0000
//        kimjava 김자바 010-333-1111
//                - 조회할 아이디입력
//                user1
//        - <조회된 결과>
//                아이디 : user1
//        이름 : 나회원
//        전화번호 : 010-222-0000
//
//        	   -> 검색된 회원아이디가 없으면
//                <조회된 결과>
//                해당 아이디가 존재하지 않습니다.
        String sign[][] = { { "admin", "김관리", "010-111-1234" },
                        { "user1", "나회원", "010-222-0000" },
                        { "kimjava", "김자바", "010-333-1111" } };
        Scanner scan = new Scanner( System.in );
        System.out.print( "조회할 아이디 입력: " );
        String chkId = scan.next();
        boolean chk = false;

            for (int i = 0; i < sign.length; i++) {

                if ( chkId.equals( sign [i] [0] ) ) {

                    System.out.println("< 조회된 결과 >");
                    System.out.println("아이디: " + sign[i][0]);
                    System.out.println("이름: " + sign[i][1]);
                    System.out.println("전화번호: " + sign[i][2]);
                    chk = true;
                    break;

                }

            }
        if ( !chk ) {

            System.out.println("< 조회된 결과 >");
            System.out.println("검색된 회원 아이디가 없습니다.");

        }
    }

}


