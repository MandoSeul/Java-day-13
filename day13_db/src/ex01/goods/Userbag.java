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
		
		System.out.println("��ٱ��� ����Դϴ�. ������̸� ������� �Է��ϼ���");
		username=sc.next(); addr=sc.next();
		System.out.println("��ǰ�� ����� Ȯ���Ͻðڽ��ϱ�? (y/n)");
		
		String str2 =sc.next();
		char ch =str2.charAt(0);
		if(ch=='Y'||ch=='y'){
			display();
			addbag();
			nowbag();
		}
		else if (ch=='N'||ch=='n'){
			System.out.println("������� ���ư��ϴ�.");
		}
		System.out.println();
	}
	public void addbag(){
		System.out.println("�߰��Ͻ� ��ǰ�� �ڵ带 �Է��ϼ��� : ");
		String str = sc.next();
		temp = code.indexOf(str);
		System.out.println("� �߰��Ͻðڽ��ϱ�?");
		number.add(sc.next());
	}
	public void nowbag(){
		System.out.println("���� ��ٱ��ϸ� Ȯ���Ͻðڽ��ϱ�? (y/n)");
		String str2 =sc.next();
		char ch =str2.charAt(0);
		if(ch=='Y'||ch=='y'){
			show();
		}
		else if (ch=='N'||ch=='n'){
			System.out.println("������� ���ư��ϴ�.");
		}
		System.out.println();
	}
	public void show(){
		Userbag user = new Userbag();
		
			Collections.sort(code);
			System.out.println(username+"�� ������� "+addr +"�Դϴ�.");
			System.out.println(username+"���� ������ ��ٱ��� �����Դϴ�.");
			System.out.print(code.get(temp)+"\t");
			System.out.print(name.get(temp)+"\t");
			System.out.print(price.get(temp)+"��"+"\t");
			System.out.print(example.get(temp)+"\t");
			System.out.println("���� : "+number.get(0));
		}
	}

