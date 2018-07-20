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
		System.out.println("1. 상품추가, 2. 상품수정 , 3. 상품검색, 4.상품출력, 5.상품삭제 , 6.프로그램 종료");
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
			System.out.println("프로그램을 종료합니다.");
			break; }
		}while(num!=6);
	}
	public void modi(){
		String nam=" ",str = " ";
		int  temp =0, num=0;
		System.out.println("수정하고 싶은 상품의 이름을 입력하세요");
		sc.nextLine();
		nam = sc.nextLine();
		temp = name.indexOf(name);
		if(temp==-1) System.out.println("찾을 수 없습니다. 메뉴로 돌아갑니다.");
		else{
		System.out.println("변경하고 싶은 부분은 어디입니까? 1.상품명  2.가격 3.상품 설명");
		num=sc.nextInt();
		switch(num){
		case 1: {
			System.out.println("변경하고 싶은 상품 명을 작성하세요");
			sc.nextLine();
			str = sc.nextLine();
			name.set(temp, str);
			System.out.println("변경되었습니다.");
			break;
		}
		case 2: {
			System.out.println("변경하고 싶은 상품의 가격을 작성하세요");
			sc.nextLine();
			str = sc.nextLine();
			price.set(temp, str);
			System.out.println("변경되었습니다.");
			break;
		}
		case 3: {
			System.out.println("변경하고 싶은 상품설명을 작성하세요");
			sc.nextLine();
			str = sc.nextLine();
			example.set(temp, str);
			System.out.println("변경되었습니다.");
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
		System.out.println("추가할 상품의 개수를 입력하세요 : ");
		num=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<num; i++){
		System.out.println("코드  상품명 가격 설명을 입력 하세요  : ");
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
			System.out.print(price.get(i)+"원"+"\t");
			System.out.println(example.get(i));
		}
	}
	public void research(){
		int temp =0;
		System.out.println("검색 방법을 선택하세요. 1.코드 ,2. 상품명 ,3. 가격 : ");
		int num=sc.nextInt();
		sc.nextLine();
		if(num==1){
			System.out.println("검색하실 코드를 입력하세요 : ");
			String str =sc.next();
			temp=code.indexOf(str);
			if(temp==-1){
				System.out.println("검색 되지 않았습니다. 다시 입력하겠습니까? (Y/N) : ");
				String str2 =sc.next();
				char ch =str2.charAt(0);
				if(ch=='Y'||ch=='y'){
					research();
				}
				else if (ch=='N'||ch=='n'){
					System.out.println("목록으로 돌아갑니다.");
				}
				
			}else{
				System.out.println("검색된 상품의 정보 입니다.");
				System.out.print(code.get(temp)+"\t");
				System.out.print(name.get(temp)+"\t");
				System.out.print(price.get(temp)+"원"+"\t");
				System.out.println(example.get(temp));
			}
			
		}else if(num==2){
			System.out.println("검색하실 상품명을 입력하세요 : ");
			String str =sc.next();
			temp=name.indexOf(str);
			if(temp==-1){
				System.out.println("검색 되지 않았습니다. 다시 입력하겠습니까? (Y/N) : ");
				String str2 =sc.next();
				char ch =str2.charAt(0);
				if(ch=='Y'||ch=='y'){
					research();
				}
				else if (ch=='N'||ch=='n'){
					System.out.println("목록으로 돌아갑니다.");
				}
				
			}else{
				System.out.println("검색된 상품의 정보 입니다.");
				System.out.print(code.get(temp)+"\t");
				System.out.print(name.get(temp)+"\t");
				System.out.print(price.get(temp)+"원"+"\t");
				System.out.println(example.get(temp));
			}
			
			
		}else if(num==3){
			System.out.println("검색하실 가격을 입력하세요 : ");
			String str =sc.next();
			temp=price.indexOf(str);
			if(temp==-1){
				System.out.println("검색 되지 않았습니다. 다시 입력하겠습니까? (Y/N) : ");
				String str2 =sc.next();
				char ch =str2.charAt(0);
				if(ch=='Y'||ch=='y'){
					research();
				}
				else if (ch=='N'||ch=='n'){
					System.out.println("목록으로 돌아갑니다.");
				}
			
				
			}else{
				System.out.println("검색된 상품의 정보 입니다.");
				System.out.print(code.get(temp)+"\t");
				System.out.print(name.get(temp)+"\t");
				System.out.print(price.get(temp)+"원"+"\t");
				System.out.println(example.get(temp));
			}
		
	}
		else{
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			research();
		}//if 
}// research
		public void remove(){
			int temp =0;
			
			
				System.out.println("삭제하실 상품명을 입력하세요 : ");
				String str =sc.next();
				temp=name.indexOf(str);
				if(temp==-1){
					System.out.println("검색 되지 않았습니다. 다시 입력하겠습니까? (Y/N) : ");
				}else{
					code.remove(temp);
					name.remove(temp);
					price.remove(temp);
					example.remove(temp);
				}
				System.out.println("삭제된 목록을 확인하시겠습니까?(Y/N) ");
				String str2 =sc.next();
				char ch =str2.charAt(0);
				if(ch=='Y'||ch=='y'){
					display();
				}
				else if (ch=='N'||ch=='n'){
					System.out.println("목록으로 돌아갑니다.");
				}
				
			}
		}

