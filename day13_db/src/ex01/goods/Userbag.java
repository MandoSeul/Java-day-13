package ex01.goods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Userbag extends goods{
	String username, addr;
	Scanner sc = new Scanner(System.in);
	
	ArrayList number = new ArrayList();
	int temp =0;
	public Userbag(){
		
	}
	public void usersinit(){
		
		System.out.println("장바구니 모드입니다. 사용자이름 배송지를 입력하세요");
		username=sc.next(); addr=sc.next();
		System.out.println("상품의 목록을 확인하시겠습니까? (y/n)");
		
		String str2 =sc.next();
		char ch =str2.charAt(0);
		if(ch=='Y'||ch=='y'){
			display();
			addbag();
			nowbag();
		}
		else if (ch=='N'||ch=='n'){
			System.out.println("목록으로 돌아갑니다.");
		}
		System.out.println();
	}
	public void addbag(){
		System.out.println("추가하실 상품의 코드를 입력하세요 : ");
		String str = sc.next();
		temp = code.indexOf(str);
		System.out.println("몇개 추가하시겠습니까?");
		number.add(sc.next());
	}
	public void nowbag(){
		System.out.println("현재 장바구니를 확인하시겠습니까? (y/n)");
		String str2 =sc.next();
		char ch =str2.charAt(0);
		if(ch=='Y'||ch=='y'){
			show();
		}
		else if (ch=='N'||ch=='n'){
			System.out.println("목록으로 돌아갑니다.");
		}
		System.out.println();
	}
	public void show(){
		Userbag user = new Userbag();
		
			Collections.sort(code);
			System.out.println(username+"의 배송지는 "+addr +"입니다.");
			System.out.println(username+"님이 담으신 장바구니 내용입니다.");
			System.out.print(code.get(temp)+"\t");
			System.out.print(name.get(temp)+"\t");
			System.out.print(price.get(temp)+"원"+"\t");
			System.out.print(example.get(temp)+"\t");
			System.out.println("수량 : "+number.get(0));
		}
	}

