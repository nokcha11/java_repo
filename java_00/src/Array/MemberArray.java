package Array;

import java.util.Scanner;

public class MemberArray {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * [ 요구사항 ]
         * 
         *  1. 다섯명의 회원명을 입력받아 String 배열을 생성하시오.
         *  
         * [ 해결 방법 ]
         * 
         *  - main() 메서드에서는 다섯 명의 회원명을 입력받아서 배열에 저장하고,
         *    저장된 회원명을 출력하는 기능을 수행합니다.
         */

        
        // 다섯명의 회원명을 입력받아 String 배열을 생성하는 메서드 호출
        String[] memberNames = inputMemberNames();

        // 생성된 회원정보를 출력하는 메서드 호출
        System.out.println("===== 입력된 회원명 리스트 =====");
        printMemberNames(memberNames);
    }

    // 다섯명의 회원명을 입력받아 String 배열을 생성하는 메서드
    public static String[] inputMemberNames() {
        String[] names = new String[5]; // 다섯 명의 회원명을 저장할 배열 생성

        System.out.println("다섯 명의 회원명을 입력하세요:");
        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + "번째 회원명: ");
            names[i] = sc.nextLine(); // 사용자로부터 회원명 입력받기
        }

        return names;
    }

    // 생성된 회원정보를 출력하는 메서드
    public static void printMemberNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ": " + names[i]); // 회원명 출력
        }
    }

}
