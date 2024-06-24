package If00_Switch;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 31일 입니다.
		// -----------------------------------------------------

		Scanner sc = new Scanner(System.in); // 한번만 실행
	
		System.out.println("case문 : 월을 입력하세요");
		int month = sc.nextInt();
		int days = 0;
		
		switch (month) {
		case 1,3,5,7,8,10,12 :
			days = 31;
			System.out.println( month + "월의 마지막 날짜는" + days + "일 입니다.");
			break;
			
		case 2 : 
			 
			System.out.println(  month + "월의 마지막 날짜는 28,(29)일 입니다.");
			break;
			
		case 4,6,9,11 : 
			days = 30;
			System.out.println( month + "월의 마지막 날짜는 30일 입니다.");
			break;
			
		default:
			System.out.println("Unexpected value: " + month);
		}
		
		// 동일한 조건식을 if문으로 작성해보기
		System.out.println();
		System.out.println("if문 : 월을 입력하세요");
		
		int month2 = sc.nextInt();

		if (month2 == 2) {
		    System.out.println(month + "월은 28일입니다."); // 2월은 항상 28일
		} else if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) {
		    System.out.println(month2 + "월은30일입니다."); // 4월, 6월, 9월, 11월은 30일
		} else {
		    System.out.println(month2 + "월은31일입니다."); // 나머지 월은 31일
		
		    
		    sc.close();
		}
	}

}