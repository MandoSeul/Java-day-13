package ex01.goods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class goods {
	Scanner sc= new Scanner(System.in);
	ArrayList name = new ArrayList();
	ArrayList code = new ArrayList();
	ArrayList price = new ArrayList();
	ArrayList example = new ArrayList();
	
	
	public goods(){
		
		} //constructor end
 
	public void init(){
	int num;
		
		do{
		System.out.println("1. ��ǰ�߰�, 2. ��ǰ���� , 3. ��ǰ�˻�, 4.��ǰ���, 5.��ǰ���� , 6.���α׷� ����");
		num=sc.nextInt();
		sc.nextLine();
		switch (num) {
		case 1:
			goodadd();
			break;
		case 2:
			break;
		case 3:research();
			break;
		case 4:
			display();
			break;
		case 5:
			remove();
			break;
		case 6:
			System.out.println("���α׷��� �����մϴ�.");
			break; }
		}while(num!=6);
	}
	public void modi(){
		String nam=" ",str = " ";
		int  temp =0, num=0;
		System.out.println("�����ϰ� ���� ��ǰ�� �̸��� �Է��ϼ���");
		sc.nextLine();
		nam = sc.nextLine();
		temp = name.indexOf(name);
		if(temp==-1) System.out.println("ã�� �� �����ϴ�. �޴��� ���ư��ϴ�.");
		else{
		System.out.println("�����ϰ� ���� �κ��� ����Դϱ�? 1.��ǰ��  2.���� 3.��ǰ ����");
		num=sc.nextInt();
		switch(num){
		case 1: {
			System.out.println("�����ϰ� ���� ��ǰ ���� �ۼ��ϼ���");
			sc.nextLine();
			str = sc.nextLine();
			name.set(temp, str);
			System.out.println("����Ǿ����ϴ�.");
			break;
		}
		case 2: {
			System.out.println("�����ϰ� ���� ��ǰ�� ������ �ۼ��ϼ���");
			sc.nextLine();
			str = sc.nextLine();
			price.set(temp, str);
			System.out.println("����Ǿ����ϴ�.");
			break;
		}
		case 3: {
			System.out.println("�����ϰ� ���� ��ǰ������ �ۼ��ϼ���");
			sc.nextLine();
			str = sc.nextLine();
			example.set(temp, str);
			System.out.println("����Ǿ����ϴ�.");
			break;
		}
	
		} //switch end
		
		System.out.print(code.get(temp)+"\t");
		System.out.print(name.get(temp)+"\t");
		System.out.println(price.get(temp)+"\t");
		System.out.println(example.get(temp));
		}
	}
	public void goodadd(){
		int num ;
		System.out.println("�߰��� ��ǰ�� ������ �Է��ϼ��� : ");
		num=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<num; i++){
		System.out.println("�ڵ�  ��ǰ�� ���� ������ �Է� �ϼ���  : ");
		code.add(sc.next());
		name.add(sc.next());
		price.add(sc.next());
		example.add(sc.next());
		}
	}
	public void display(){
		Collections.sort(code);
		for(int i=0; i<name.size(); i++){
			System.out.print(code.get(i)+"\t");
			System.out.print(name.get(i)+"\t");
			System.out.print(price.get(i)+"��"+"\t");
			System.out.println(example.get(i));
		}
	}
	public void research(){
		int temp =0;
		System.out.println("�˻� ����� �����ϼ���. 1.�ڵ� ,2. ��ǰ�� ,3. ���� : ");
		int num=sc.nextInt();
		sc.nextLine();
		if(num==1){
			System.out.println("�˻��Ͻ� �ڵ带 �Է��ϼ��� : ");
			String str =sc.next();
			temp=code.indexOf(str);
			if(temp==-1){
				System.out.println("�˻� ���� �ʾҽ��ϴ�. �ٽ� �Է��ϰڽ��ϱ�? (Y/N) : ");
				String str2 =sc.next();
				char ch =str2.charAt(0);
				if(ch=='Y'||ch=='y'){
					research();
				}
				else if (ch=='N'||ch=='n'){
					System.out.println("������� ���ư��ϴ�.");
				}
				
			}else{
				System.out.println("�˻��� ��ǰ�� ���� �Դϴ�.");
				System.out.print(code.get(temp)+"\t");
				System.out.print(name.get(temp)+"\t");
				System.out.print(price.get(temp)+"��"+"\t");
				System.out.println(example.get(temp));
			}
			
		}else if(num==2){
			System.out.println("�˻��Ͻ� ��ǰ���� �Է��ϼ��� : ");
			String str =sc.next();
			temp=name.indexOf(str);
			if(temp==-1){
				System.out.println("�˻� ���� �ʾҽ��ϴ�. �ٽ� �Է��ϰڽ��ϱ�? (Y/N) : ");
				String str2 =sc.next();
				char ch =str2.charAt(0);
				if(ch=='Y'||ch=='y'){
					research();
				}
				else if (ch=='N'||ch=='n'){
					System.out.println("������� ���ư��ϴ�.");
				}
				
			}else{
				System.out.println("�˻��� ��ǰ�� ���� �Դϴ�.");
				System.out.print(code.get(temp)+"\t");
				System.out.print(name.get(temp)+"\t");
				System.out.print(price.get(temp)+"��"+"\t");
				System.out.println(example.get(temp));
			}
			
			
		}else if(num==3){
			System.out.println("�˻��Ͻ� ������ �Է��ϼ��� : ");
			String str =sc.next();
			temp=price.indexOf(str);
			if(temp==-1){
				System.out.println("�˻� ���� �ʾҽ��ϴ�. �ٽ� �Է��ϰڽ��ϱ�? (Y/N) : ");
				String str2 =sc.next();
				char ch =str2.charAt(0);
				if(ch=='Y'||ch=='y'){
					research();
				}
				else if (ch=='N'||ch=='n'){
					System.out.println("������� ���ư��ϴ�.");
				}
			
				
			}else{
				System.out.println("�˻��� ��ǰ�� ���� �Դϴ�.");
				System.out.print(code.get(temp)+"\t");
				System.out.print(name.get(temp)+"\t");
				System.out.print(price.get(temp)+"��"+"\t");
				System.out.println(example.get(temp));
			}
		
	}
		else{
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			research();
		}//if 
}// research
		public void remove(){
			int temp =0;
			
			
				System.out.println("�����Ͻ� ��ǰ���� �Է��ϼ��� : ");
				String str =sc.next();
				temp=name.indexOf(str);
				if(temp==-1){
					System.out.println("�˻� ���� �ʾҽ��ϴ�. �ٽ� �Է��ϰڽ��ϱ�? (Y/N) : ");
				}else{
					code.remove(temp);
					name.remove(temp);
					price.remove(temp);
					example.remove(temp);
				}
				System.out.println("������ ����� Ȯ���Ͻðڽ��ϱ�?(Y/N) ");
				String str2 =sc.next();
				char ch =str2.charAt(0);
				if(ch=='Y'||ch=='y'){
					display();
				}
				else if (ch=='N'||ch=='n'){
					System.out.println("������� ���ư��ϴ�.");
				}
				
			}
		}

