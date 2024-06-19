package java_00;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
	  int varNum =5;
		String varString ="5";
		
		int varNumber;
		varNumber = 100;
		
		int varNumberResult;
		
		varNumberResult = varNum + varNumber;	
		
		System.out.println("숫자 변수 1 : [" + varNum + " ] 입니다. ");
		System.out.println("숫자 변수 2 : [" + varNumber + " ] 입니다. ");
		System.out.println(varNumber);
		System.out.println( varNumberResult);
		
		// "따옴표안에 숫자를 문자로 인식"
		System.out.println("숫자 1과 숫자2를 더하면 ? [" + varNum + varNumber + "]");
		
		// 괄호안에 숫자를 묶어주면 숫자로 인식
		System.out.println("숫자 1과 숫자2를 더하면 ? [" + (varNum + varNumber) + "]");
		*/
		
		// 변수 값 바꾸기
		int num1 = 10;
		int num2 = 20;

		int numResult;
		
		System.out.println("=== 숫자 바꾸기 전 ===");
		System.out.println("숫자 1 [" + num1 + "]");
		System.out.println("숫자 2 [" + num2 + "]");
//		System.out.println("더한값  [" + numResult + "]");
		
		numResult = num1;
		num1 = num2;
		num2 = numResult;
		
		System.out.println("=== 숫자 바꾸기 후 ===");
		System.out.println("숫자 1 [" + num1 + "]");
		System.out.println("숫자 2 [" + num2 + "]");
		
		// 변수 값 바꾸기 3개
		int var1 = 10;
		int var2 = 20;
		int var3 = 30;
		
		// 저장할 값을 넣어준다
		int varTemp;
		
		System.out.println("=== 숫자 바꾸기 전 ===");
		System.out.println("숫자 1 [" + var1 + "]");
		System.out.println("숫자 1 [" + var2 + "]");
		System.out.println("숫자 1 [" + var3 + "]");
		
		
		varTemp = var1; // 저장된 varTemp에 1번 값을 넣어준다 
		var1 = var2; // 1번의 값에 2번 값을 넣어준다.
		var2 = var3;
		var3 = varTemp; //3번에는 원래 1번의 10의 값을 갖는다.
				
		System.out.println("=== 숫자 바꾸기 후 ===");
		System.out.println("숫자 1 [" + var1 + "]");
		System.out.println("숫자 1 [" + var2 + "]");
		System.out.println("숫자 1 [" + var3 + "]");
				
		
		// 년도 계산
		int curYear = 2024;
		int varNum = 1;
		
		int yearResult;
		
		
		//나이 계산
		int curAge = 45;
		
		int ageResult;
		
		// 다음해 계산 
		yearResult = curYear + varNum; //2025
		ageResult = curAge + varNum;//45
		
		
		System.out.println(" 올해는 [" + curYear + " ] 년도 입니다.");
		System.out.println(" 올해 내 나이는 [" + curAge + "] 세 입니다.");
		
		// ageResult = curAge + varNum;//46
		System.out.println(" 다음해는 [" + yearResult + " ] 년도 입니다.");//2005
		System.out.println(" 다음해 내 나이는 [" + ageResult + "] 세 입니다.");//46
		
		
		yearResult = yearResult + varNum;//2026
		ageResult = ageResult + varNum; //47 식안의 ageResult값이 전의 바뀐 46세 값
		System.out.println(" 다다음해는 [" + yearResult + " ] 년도 입니다.");
		System.out.println(" 다다음해는 내 나이는 [" + ageResult + " ] 세 입니다.");
		
	
		yearResult = yearResult + varNum;//2027
		ageResult =  ageResult + varNum; //48 ageResult에 위의 ageResult값을 안의 ageResult에 반영
		int ageResult2 = ageResult;//48 변수 선언 새로준것 - 위의 받아오는 식은 그대로 두고 변수만 새로선언
		System.out.println(" 다다다음해는 [" + yearResult + " ] 년도 입니다.");
		//System.out.println(" 다다다음해는 내 나이는 [" + ageResult + " ] 세 입니다.");
		System.out.println(" 다다다음해는 내 나이는 [" + ageResult2 + " ] 세 입니다.");
				
		
		
		
	}

}
