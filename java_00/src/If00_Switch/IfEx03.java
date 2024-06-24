package java_00;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {

		// -----------------------------------------------------
		// 학생의 성적을 Scanner로 입력받아, 학점을 출력하세요.
		//
		// 90점 이상이면, A
		// 80점 이상이면, B
		// 70점 이상이면, C
		// 60점 이상이면, D
		// 60점 미만이면, F
		// -----------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 : ");
		int score = sc.nextInt();
		
		String result = "";
		
		if (score >=90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		}  else if (score >= 60) {
			result = "D";
		}  else if (score < 60) {
			result = "F";
		}
		
		System.out.println("당신의 점수는 " + score + " 점이고, 학점은 " +result + "입니다." );
		
		// -----------------------------------------------------
		// Scanner를 통해 1부터 5까지의 숫자를 입력 받아 영문으로 변환
		// 
		// [ 결과 예시 ] 1 은 one 입니다.
		// -----------------------------------------------------
		
		
		
		System.out.println("이 숫자의 영문은 : ");
		int num1 = sc.nextInt();
		
		String alphabet = "";
		
		if (num1 == 1) {
			result = "one";
		} else if (num1 == 2 ) {
			alphabet = "two";
		} else if (num1 == 3) {
			alphabet = "three";
		} else if (num1 == 4) {
			alphabet = "four";
		} else if (num1 == 5 ) {
			alphabet = "five";
		} else {
			alphabet = "처리 불가 숫자";
		}
		System.out.println( num1 +"은 영어로" + alphabet + "입니다.");
		
		sc.close();

	}

}