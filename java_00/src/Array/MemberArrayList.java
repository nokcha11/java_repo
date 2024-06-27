package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberArrayList {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * [ 요구사항 ]
         * 
         *  1. 회원명을 입력받아 ArrayList를 생성하시오.
         *  2. "그만" 이라고 입력하면 프로그램 종료
         */

        // 회원명을 입력받아 ArrayList를 생성하는 메서드 호출
        ArrayList<String> members = inputMemberNames();

        // 생성된 회원정보를 출력하는 메서드 호출
        System.out.println("===== 입력된 회원명 리스트 =====");
        printMemberNames(members);
    }

    // 회원명을 입력받아 ArrayList를 생성하는 메서드
    public static ArrayList<String> inputMemberNames() {
        ArrayList<String> names = new ArrayList<>();

        System.out.println("회원명을 입력하세요. 종료하려면 '그만'을 입력하세요.");

        while (true) {
            System.out.print("회원명 입력: ");
            String name = sc.nextLine();

            if (name.equals("그만")) {
                break;
            }

            names.add(name);
        }

        return names;
    }

    // 생성된 회원정보를 출력하는 메서드
    public static void printMemberNames(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ": " + names.get(i));
        }
    }

}
