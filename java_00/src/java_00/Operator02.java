package java_00; 

public class Operator02 {
	public static void main(String[] args) {

		/*
			비교 연산자
			- >, >=, <, <=, ==(equals), !=(not equals)
			(=은 대입자이기 때문에 == 두번 씀)
			- 2항 연산자
			- 피연산자들의 우위(동등) 비교하는 연산자
			- 피연산자는 숫자형을 가진다.
			- 연산의 결과가 항상 boolean이다.

		 */


		int a = 10;
		int b = 3;

		System.out.println(a + " > " + b + " = " + (a > b));
		System.out.println(a + " >= " + b + " = " + (a >= b));
		System.out.println(a + " < " + b + " = " + (a < b));
		System.out.println(a + " == " + b + " = " + (a == b));
		System.out.println(a + " != " + b + " = " + (a != b));
		System.out.println();


		
		

	}
}
