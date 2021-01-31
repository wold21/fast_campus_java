package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���̸� �Է����ּ���");

		int age = sc.nextInt();
		sc.close();

		int charge = 0;

		// if�� if�� ���� ������ ������.
		// if�� else if, else�� �ϳ��� ���ǿ� �ɸ���
		// ������ ������ �ȰǴ�.
		if (age < 8) {
			charge = 1000;
			System.out.println("������");
		} else if (age < 14) {
			charge = 1500;
			System.out.println("�ʵ��");
		} else if (age < 20) {
			charge = 2000;
			System.out.println("�߰����");
		} else {
			charge = 3000;
			System.out.println("������");
		}

		System.out.println("���� : " + age);
		System.out.println("��� : " + charge);
	}
}
