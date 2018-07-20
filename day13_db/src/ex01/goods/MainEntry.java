package ex01.goods;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		goods gd = new goods();
		gd = new Userbag();
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("모드를 선택하세요. 1. 상품추가 모드 2. 장바구니 모드 3. 프로그램 종료");
		int num = sc.nextInt();
		switch(num){
		case 1 :  gd.init();; break;
		case 2 :  ((Userbag) gd).usersinit(); break;
		case 3 :  System.exit(0);
		default : System.out.println("잘못된 입력입니다.");
		}
		}
	}
}
