package ex01.goods;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		goods gd = new goods();
		gd = new Userbag();
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("��带 �����ϼ���. 1. ��ǰ�߰� ��� 2. ��ٱ��� ��� 3. ���α׷� ����");
		int num = sc.nextInt();
		switch(num){
		case 1 :  gd.init();; break;
		case 2 :  ((Userbag) gd).usersinit(); break;
		case 3 :  System.exit(0);
		default : System.out.println("�߸��� �Է��Դϴ�.");
		}
		}
	}
}
