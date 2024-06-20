package java_00;

public class Ex01_Myintro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//퀴즈1 나의소개
		
		String name = "서여진";
		String position = "대전광역시 대덕구";
		int age  = 36;
		String height = "소수점 두자리의 키";
		int weight = 45;
		
		String sake = "막걸리";
		int sake1 = 1;
		
		String food = "다크초콜릿";
		
		
		System.out.println(" 나는 " + name + " 입니다.");
		System.out.println(" 나는 " + position + " 살고 있습니다.");
		System.out.println(" 내 나이는 " + age + "  살 이에요.");
		System.out.println(" 키는 " + height + "  이고, 몸무게는 " + weight + " 랍니다.");
		System.out.println(" 평소에 " + sake + " 이란 술을좋아하고," + sake1 + " 병 정도 마십니다.");
		System.out.println(" 나는 " + food + "을 무척 좋아합니다.");
		
		
		
		//퀴즈2
		int month =12;
		int day =25;
		String chr = "크리스마스";
		System.out.println(month + "월" + day + "일은" +chr+ " 입니다.");
		
		
	
		int year = 2024;
		int varNum = 1;
		int yearResult = year - varNum;
		
		
		float per = 72.893f; // 소수는 float | float은 숫자 뒤에 f를 붙인다.
		System.out.println("작년" + yearResult + "년도 대학 합격률은" + per + "퍼센트 였습니다.");
		
		int hund = 100;
		int ten =10;
		int hunt;
		
		hunt = hund + ten;
		System.out.println(hund + "이라는 숫자에" + ten + "을 더하면 " +hunt+ "이 됩니다.");
		
		
		double pie = 3.141592653598793;// double은 소수점이 길때
		int radius = 5;
		
		//원의 둘레 = 원주율*반지름*2
		double size = pie*radius*2;

		//원의 넓이 = 원주율*반지름*반지름
		double w =  pie*radius*radius;
		System.out.println(" 원주율은 " + pie + "이고, 반지름이 " + radius + "인 원의 둘레는" +size+"입니다.");
		
		System.out.println(" 반지름이 " + radius + "인 원의 넓이는" + w + "입니다.");
		
		
		char c = '붹';
		int d = c;
		System.out.println(  c + "의 문자번호는 " + d + "입니다.");
		
		
		float del = 58.78945f;
		int int1 = (int)del;
		System.out.println(  del + "를 버림하면 " + int1 + "입니다.");
		
		
		
		//퀴즈3
		String a = "는" ;
		String b = "이다";
		
		boolean tr = true;
		boolean fa = false;
		
		System.out.println( "푸바오" + a + " 자이언트 판다" +b +" [" + tr + " ]" );
		
		
		
		System.out.println( "원숭이 덩덩이" + a + " 노랗다 [" + fa + " ]" );
		
		
		
		System.out.println( "나" + a + " 여자다 [" + tr + " ]" );
		
		
		
		
		System.out.println( "나" + a + " 열살이다 [" + tr + "]" );
		
		
		
		System.out.println( "사람의 다리" + a + " 3개다 [" + fa + " ]" );
		
		
		
		
		System.out.println( "현재 시간은 오전 9시" + b + "[" + tr + " ]" );
		
		
	
		
		System.out.println( "나" + a + " 프로그래밍이 재밌다. [" + fa + " ]" );
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
