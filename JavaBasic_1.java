package _JavaBasic_01;

import java.util.Arrays;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;


//★★★★반드시 @author란에 별명 만들어서 코드 식별하게끔 작성 바랍니다.
/**
 * @author 별명입력해주세요.
 *
 */
public class JavaBasic_1 {
	// 과제 목표 주어진 코드 모두 스스로 짜본다!
	public static void main(String[] args) {
		// 순서대로 코드 짜주세요.
		// 1. 알맞은 변수 선언하고 출력하기
		// Ex) 정수형으로 1000 출력 하기
		int value = 1000;
		System.out.println(value);
		// 1.1 정수형으로 94743616344 출력하기

		long valueLong = 94743616344l;

		System.out.println(valueLong);

		// 1.2 실수형으로 3.14 출력하기

		double valueDouble = 3.14;

		System.out.println(valueDouble);
		// 1.3 100을 3으로 나누고, 소수점 표시하기 ex) 33.333333
		valueDouble = 100 / 3.0;
		System.out.printf("%6f \n", valueDouble);
		// 1.4 실수 12.71을 선언하고, 소수점 버리기 ex) 12
		System.out.println();
		// 1.5 byte b에 128로 초기화 억지로 시키기
		value = 128;
		byte b = (byte) value;

		System.out.println(b);

//		2. 각종 연산자와 if문 Switch문 함께 사용하기
		// Ex) val2라는 인자가 100보다 큰지 확인하고, 결과 '예' '아니오' 출력하기
		int val2 = 123;
		if (val2 > 100) {
			System.out.println("예");
		} else {
			System.out.println("아니오");
		}

		// 2.1 한수를 입력받아 2의 배수, 3의 배수, 5의 배수인지 확인하세요.
		Scanner sc = new Scanner(System.in);

		int i2 = Integer.parseInt(sc.nextLine());

		if (i2 % 2 == 0) {
			System.out.println("2의 배수이다.");
		} else {
			System.out.println("2의 배수가 아니다.");
		}

		if (i2 % 3 == 0) {
			System.out.println("3의 배수이다.");
		} else {
			System.out.println("3의 배수가 아니다.");
		}
		if (i2 % 5 == 0) {
			System.out.println("5의 배수이다.");
		} else {
			System.out.println("5의 배수가 아니다.");
		}

		// 2.2 // 1~300 중에 한수를 입력받고,
		// 1~100이하 구간, 100초과 ~ 200 이하 구간, 200~초과 구간으로 분리하여 출력하세요.
		// 50 = 1~100 구간 , 124 = 100~200구간
		System.out.print("1~300 중에 수를 하나 입력하시오 : ");
		i2 = Integer.parseInt(sc.nextLine());

		if (1 <= i2 && i2 <= 100) {
			System.out.println("1~100구간");
		} else if (100 < i2 && i2 <= 200) {
			System.out.println("100~200구간");
		} else {
			System.out.println("200이상");
		}
		// 2.3 switch문을 통해 숫자와 문자를 구별하는 코드를 작성하세요.
		System.out.print("숫자 1~3 중 하나를 입력하시오 : ");
		i2 = Integer.parseInt(sc.nextLine());

		switch (i2) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;

		default:
			System.out.println("잘못입력하셨습니다.");

		}
		System.out.print("숫자 1~3 중 하나를 입력하시오 : ");
		String str = sc.nextLine();

		switch (str) {
		case "1":
			System.out.println("1입니다.");
			break;
		case "2":
			System.out.println("2입니다.");
			break;
		case "3":
			System.out.println("3입니다.");
			break;

		default:
			System.out.println("잘못입력하셨습니다.");

		}

		// 2.4 ID/PW를 입력받고, ID가 5글자 이상이고, ID에 PW가 포함되지 않은 상태를
		// if문 하나로 체크해주세요.
		System.out.print("ID : ");
		String id = sc.nextLine();

		System.out.print("PASS : ");
		String pass = sc.nextLine();

		if (id.length() > 4 && !(id.equals(pass))) {
			System.out.println("로그인되었습니다.");
		}

//		3. 반복문
		// ex) 1~10까지 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// 3.1 구구단 2단만 출력하기 ex) 2 X 1 = 2 꼴로

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("2 X "+i+" = "+ 2*i);
			}
		}

		// 3.2 1부터 100까지 짝수만 골라서 출력하기
		
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 3.3 1부터 100까지 수 중에 5의 배수와 7의 배수를 확인하고 출력하기.
		for (int i = 1; i < 101; i++) {
			if (i % 5 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}

		// 3.4 1부터 1000까지 수 중에
		// 3의 배수이면서 4의 배수인 수를 모두 찾고,
		// 이중에 20번을 찾으면 반복문 정지하기.
		int flag = 0;
		for (int i = 1; i < 1001; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
				flag++;
			}
			if(flag==20) {
				System.out.println("3.4문제 끝");
				break;
			}
		}
		
//		4. 중첩 반복문
		// 4.1 구구단 1단부터 9단까지 모두 출력하는데, 단이 바뀔때마다 "x단" 표시하기
		// ex) 2 X 9 = 18;
		// 3단 시작!
		// 3 X 1 = 3
		for(int i = 1; i<10;i++) {
		
			for(int j = 1; j<10;j++) {
				System.out.println(i+"단 시작");
				System.out.println( i +" X "+ j + " = " + i*j);
				
			}
			
		}
		// 4.2 구구단 1단부터 9단까지 모두 출력하는데
		// 9단까지 가로로 출력하기
		// ex) 2X1=1 3X1=3 4X1=4 ...
		// 2X2=2 3X2=6 4X2=8
		
		for(int i = 1; i<10;i++) {
			
			for(int j = 1; j<10;j++) {
				System.out.print( j +" X "+ i + " = " + i*j + " ");
				
			}
			System.out.println();
			
		}

		// 4.3 사용자에게 1~100 수중 2개를 입력 받고, 두 수의 범위 안의 숫자 모두 출력하기.
		// 단, 무한 반복하기.
		// 입력 53, 47
		// 출력 48, 49, 50, 51, 52
		while(true) {
		System.out.print("정수 1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수 2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int numMin = 0;
		int numMax = 0;
		
		if(num1<num2) {
		numMin = num1;
		numMax = num2;
		}else {
			numMin = num2;
			numMax = num1;
		}
		for(int i = numMin; i < numMax ; i++) {
			System.out.print(i+" ");
		}
		
		break;
		
		}
		System.out.println();

//		5. 배열
//		5.1 배열 정수형으로 10개 칸을 선언하고, 1부터 10까지로 값 초기화 하기 
		
		int[] array = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			
			array[i] = i;
			
			System.out.println(array[i]);
		}
		
		

//		5.2 배열 정수형으로 100개까지 선언하고, 3과 7의 배수 100개 찾아서 넣기
		// 21, 42 .....

		int[] array2 = new int[100];
		int count = 0;
		
		for(int i = 0;true;i++) {
			
			if(i%3==0&&i%7==0) {
				array2[count++] = i;
				System.out.print(i+" ");
			}
			if(count==100) {
				break;
			}
			
		}
		System.out.println();
		
//		5.3 배열 String형으로 10개 공간 선언하고 사용자의 값을 입력받아 값 저장하기.
		// 단, exit로 입력시 바로 종료하고 저장 받은 데이터 모두 출력

		String[] array3 = new String[10];
		
		for(int i = 0; i<array3.length;i++) {
			
			System.out.print("값을 입력하시오 : ");
			
			array3[i] = sc.nextLine();
			
			if(array3[i].equals("exit")) {
				System.out.println(Arrays.toString(array3));
				break;
			}
			
		}
		
//		5.4 배열 String형으로 10개 공간 선언하고 사용자의 값을 입력받아 값 저장하기.
		// 이중에 숫자로 입력된 값만 출력하기
		
//		???

//		5.5 배열 String형으로 10개 공간 선언하고 사용자에게 '영문' 값을 입력받아 값 저장하기.
		// 이중에 알파벳 별로 모두 count 해보기.
		// abc bbb ccc
		// a : 1개
		// b : 4개
		// c : 4개
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		
		String[] array5 = new String[10];
		
		for(int i = 0; i<array5.length;i++) {
			
			System.out.print("값을 입력하시오 : ");
			
			array5[i] = sc.nextLine();
			
			for(int j = 0;j<array5[i].length();j++) {
			
			if(array5[i].charAt(j)=='a') {
			aCount++;
			}
			if(array5[i].charAt(j)=='b') {
				bCount++;
			}
			if(array5[i].charAt(j)=='c') {
				cCount++;
			}
		
			}
		}
		System.out.println(Arrays.toString(array5));
		System.out.println("a : " + aCount);
		System.out.println("b : " + bCount);
		System.out.println("c : " + cCount);
		
		
		
	}
}
