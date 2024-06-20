package java_00; 

public class DataType03 {

	public static void main(String[] args) {

		/*
		[ 강제형변환 ]
		 크기가 큰 데이터 타입의 자료를 작은 데이터 타입으로 변환할 때는
		 직접 변환할 자료형을 지정해 주어야 한다.
	 */
		
		
		// int -> char 강제형변환
		int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값: "+c); //72의 문자코드 H

		// double -> int 강제형변환
		// 값의 손실이 발생할 수 있는 예시
		double d = 4.98765;
		int j = (int) d; // int로 정수로표현하기 떄문에 소수점빼고 4
		j = j * 100; // 4*100
		System.out.println("어떤 값이 나올까? : " + j); // 이 경우 소숫점이 전부 누락되어 4로 대입됨(값의 손실 발생)

		
		/*
         크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
         반드시 형 변환 연산자(type casting operator): (type)를 사용하여 명시적으로
         형 변환을 진행해야 한다. (DownCasting)

         명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
         저장 공간이 줄어들어 데이터 손실 및 전혀 다른 결과값을 도출할 가능성이 항상 존재하기 때문입니다.
         (overflow(양수쪽으로 터지는 것), underflow(음수쪽으로 터지는 것))
		 */
		
		// 자료형 기본인 int 끼리의 합
		int intVal1 = 100;
		int intVal2 = 200;
		
		System.out.println("두 숫자의 합은 ? " + intVal1 + intVal2); //앞에 ""로 문자로 인식돼서 출력 값 -> 100200
		
		int intResult = 0;
		intResult = intVal1 +  intVal2; //결과값을 보내줄 새로운 변수에 넣어주는게 좋다
		
		
		// System.out.println("두 숫자의 합은 ? " + ( intVal1 + intVal2) ); // ()괄호로 묶어줘야 결과값이 300으로 출력
		System.out.println("두 숫자의 합은 ? " +  intResult );
		
		
		// 문자와 문자의 결합
		String strVal1 = "1";
		String strVal2 = "2";
		
		System.out.println("문자결합 :: " + strVal1 + strVal2);
		
		int intStr1 = 1;
		int intStr2 = 2;
		
		// strVal1 = (String) intStr1;
		strVal1 = String.valueOf(intStr1); // 숫자를 문자로 바꿔주는 식
		strVal2 = String.valueOf(intStr2);
		
		System.out.println("문자결합 :: " + intStr1 + intStr2); // 앞에""따옴표로 문자형태. 숫자를 괄호로 따로 묶어 주지않으면 문자형태 
		System.out.println("문자결합 :: " +  strVal1 + strVal2); // 숫자를 문자로 변경했기 때문에
		
		
		
		// java String을 int로 변환
		String str1 = "1";
		System.out.println(Integer.parseInt(str1));
		
		int strint1 = Integer.parseInt(str1); //문자를 숫자로 바꿔주는 식
		int strint2 = 500;
		System.out.println("String int1 = " + strint1); //1
		System.out.println("int2 = " + strint2); //500
		System.out.println("String int1 + int2 = " + (strint1 + strint2)); //501
		
		
		// java String을 float으로 변환
		String str2 = "2.0";
		Float.parseFloat(str2); // float으로 변경
		System.out.println(str2); // 2.0
		
		System.out.println(Float.parseFloat(str2)); //2.0
		 
	
		float strflt1 = Float.parseFloat(str2);
		float strflt2 = 0.5f;
		
		System.out.println("float string int1 + int2 = " + strflt1 + strflt2);//문자형태
		System.out.println("float int1 + int2 = " + (strflt1 + strflt2)); //숫자형태
		
		
	
		
		// java String을 Double로 변환
		String str3 = "3.0";
		System.out.println(Double.parseDouble(str3)); //3.0

		
		
		
	}
}
