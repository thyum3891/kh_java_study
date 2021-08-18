package _JavaBasic_01;

import java.util.Arrays;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;


//�ڡڡڡڹݵ�� @author���� ���� ���� �ڵ� �ĺ��ϰԲ� �ۼ� �ٶ��ϴ�.
/**
 * @author �����Է����ּ���.
 *
 */
public class JavaBasic_1 {
	// ���� ��ǥ �־��� �ڵ� ��� ������ ¥����!
	public static void main(String[] args) {
		// ������� �ڵ� ¥�ּ���.
		// 1. �˸��� ���� �����ϰ� ����ϱ�
		// Ex) ���������� 1000 ��� �ϱ�
		int value = 1000;
		System.out.println(value);
		// 1.1 ���������� 94743616344 ����ϱ�

		long valueLong = 94743616344l;

		System.out.println(valueLong);

		// 1.2 �Ǽ������� 3.14 ����ϱ�

		double valueDouble = 3.14;

		System.out.println(valueDouble);
		// 1.3 100�� 3���� ������, �Ҽ��� ǥ���ϱ� ex) 33.333333
		valueDouble = 100 / 3.0;
		System.out.printf("%6f \n", valueDouble);
		// 1.4 �Ǽ� 12.71�� �����ϰ�, �Ҽ��� ������ ex) 12
		System.out.println();
		// 1.5 byte b�� 128�� �ʱ�ȭ ������ ��Ű��
		value = 128;
		byte b = (byte) value;

		System.out.println(b);

//		2. ���� �����ڿ� if�� Switch�� �Բ� ����ϱ�
		// Ex) val2��� ���ڰ� 100���� ū�� Ȯ���ϰ�, ��� '��' '�ƴϿ�' ����ϱ�
		int val2 = 123;
		if (val2 > 100) {
			System.out.println("��");
		} else {
			System.out.println("�ƴϿ�");
		}

		// 2.1 �Ѽ��� �Է¹޾� 2�� ���, 3�� ���, 5�� ������� Ȯ���ϼ���.
		Scanner sc = new Scanner(System.in);

		int i2 = Integer.parseInt(sc.nextLine());

		if (i2 % 2 == 0) {
			System.out.println("2�� ����̴�.");
		} else {
			System.out.println("2�� ����� �ƴϴ�.");
		}

		if (i2 % 3 == 0) {
			System.out.println("3�� ����̴�.");
		} else {
			System.out.println("3�� ����� �ƴϴ�.");
		}
		if (i2 % 5 == 0) {
			System.out.println("5�� ����̴�.");
		} else {
			System.out.println("5�� ����� �ƴϴ�.");
		}

		// 2.2 // 1~300 �߿� �Ѽ��� �Է¹ް�,
		// 1~100���� ����, 100�ʰ� ~ 200 ���� ����, 200~�ʰ� �������� �и��Ͽ� ����ϼ���.
		// 50 = 1~100 ���� , 124 = 100~200����
		System.out.print("1~300 �߿� ���� �ϳ� �Է��Ͻÿ� : ");
		i2 = Integer.parseInt(sc.nextLine());

		if (1 <= i2 && i2 <= 100) {
			System.out.println("1~100����");
		} else if (100 < i2 && i2 <= 200) {
			System.out.println("100~200����");
		} else {
			System.out.println("200�̻�");
		}
		// 2.3 switch���� ���� ���ڿ� ���ڸ� �����ϴ� �ڵ带 �ۼ��ϼ���.
		System.out.print("���� 1~3 �� �ϳ��� �Է��Ͻÿ� : ");
		i2 = Integer.parseInt(sc.nextLine());

		switch (i2) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;

		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");

		}
		System.out.print("���� 1~3 �� �ϳ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();

		switch (str) {
		case "1":
			System.out.println("1�Դϴ�.");
			break;
		case "2":
			System.out.println("2�Դϴ�.");
			break;
		case "3":
			System.out.println("3�Դϴ�.");
			break;

		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");

		}

		// 2.4 ID/PW�� �Է¹ް�, ID�� 5���� �̻��̰�, ID�� PW�� ���Ե��� ���� ���¸�
		// if�� �ϳ��� üũ���ּ���.
		System.out.print("ID : ");
		String id = sc.nextLine();

		System.out.print("PASS : ");
		String pass = sc.nextLine();

		if (id.length() > 4 && !(id.equals(pass))) {
			System.out.println("�α��εǾ����ϴ�.");
		}

//		3. �ݺ���
		// ex) 1~10���� ����ϱ�
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// 3.1 ������ 2�ܸ� ����ϱ� ex) 2 X 1 = 2 �÷�

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("2 X "+i+" = "+ 2*i);
			}
		}

		// 3.2 1���� 100���� ¦���� ��� ����ϱ�
		
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 3.3 1���� 100���� �� �߿� 5�� ����� 7�� ����� Ȯ���ϰ� ����ϱ�.
		for (int i = 1; i < 101; i++) {
			if (i % 5 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}

		// 3.4 1���� 1000���� �� �߿�
		// 3�� ����̸鼭 4�� ����� ���� ��� ã��,
		// ���߿� 20���� ã���� �ݺ��� �����ϱ�.
		int flag = 0;
		for (int i = 1; i < 1001; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
				flag++;
			}
			if(flag==20) {
				System.out.println("3.4���� ��");
				break;
			}
		}
		
//		4. ��ø �ݺ���
		// 4.1 ������ 1�ܺ��� 9�ܱ��� ��� ����ϴµ�, ���� �ٲ𶧸��� "x��" ǥ���ϱ�
		// ex) 2 X 9 = 18;
		// 3�� ����!
		// 3 X 1 = 3
		for(int i = 1; i<10;i++) {
		
			for(int j = 1; j<10;j++) {
				System.out.println(i+"�� ����");
				System.out.println( i +" X "+ j + " = " + i*j);
				
			}
			
		}
		// 4.2 ������ 1�ܺ��� 9�ܱ��� ��� ����ϴµ�
		// 9�ܱ��� ���η� ����ϱ�
		// ex) 2X1=1 3X1=3 4X1=4 ...
		// 2X2=2 3X2=6 4X2=8
		
		for(int i = 1; i<10;i++) {
			
			for(int j = 1; j<10;j++) {
				System.out.print( j +" X "+ i + " = " + i*j + " ");
				
			}
			System.out.println();
			
		}

		// 4.3 ����ڿ��� 1~100 ���� 2���� �Է� �ް�, �� ���� ���� ���� ���� ��� ����ϱ�.
		// ��, ���� �ݺ��ϱ�.
		// �Է� 53, 47
		// ��� 48, 49, 50, 51, 52
		while(true) {
		System.out.print("���� 1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("���� 2 : ");
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

//		5. �迭
//		5.1 �迭 ���������� 10�� ĭ�� �����ϰ�, 1���� 10������ �� �ʱ�ȭ �ϱ� 
		
		int[] array = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			
			array[i] = i;
			
			System.out.println(array[i]);
		}
		
		

//		5.2 �迭 ���������� 100������ �����ϰ�, 3�� 7�� ��� 100�� ã�Ƽ� �ֱ�
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
		
//		5.3 �迭 String������ 10�� ���� �����ϰ� ������� ���� �Է¹޾� �� �����ϱ�.
		// ��, exit�� �Է½� �ٷ� �����ϰ� ���� ���� ������ ��� ���

		String[] array3 = new String[10];
		
		for(int i = 0; i<array3.length;i++) {
			
			System.out.print("���� �Է��Ͻÿ� : ");
			
			array3[i] = sc.nextLine();
			
			if(array3[i].equals("exit")) {
				System.out.println(Arrays.toString(array3));
				break;
			}
			
		}
		
//		5.4 �迭 String������ 10�� ���� �����ϰ� ������� ���� �Է¹޾� �� �����ϱ�.
		// ���߿� ���ڷ� �Էµ� ���� ����ϱ�
		
//		???

//		5.5 �迭 String������ 10�� ���� �����ϰ� ����ڿ��� '����' ���� �Է¹޾� �� �����ϱ�.
		// ���߿� ���ĺ� ���� ��� count �غ���.
		// abc bbb ccc
		// a : 1��
		// b : 4��
		// c : 4��
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		
		String[] array5 = new String[10];
		
		for(int i = 0; i<array5.length;i++) {
			
			System.out.print("���� �Է��Ͻÿ� : ");
			
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
