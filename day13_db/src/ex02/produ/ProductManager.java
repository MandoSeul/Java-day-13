package ex02.produ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
	Scanner sc = new Scanner(System.in);
	List <Product> pList = new ArrayList<Product>();
	public void start(){
		while(true){
			System.out.println("1.��ǰ�߰� | 2.��ǰ���� | 3. ��ǰ��ȸ | 4. ��� ��ǰ�� ��ȸ");
			int userSel = Integer.parseInt(sc.nextLine());
			if(userSel == 1) addProduct();
			else if(userSel ==2) deleteProduct();
			else if(userSel == 4) printAllproduct();
		}
	}
	
	public Product addProduct(){
		Product p = new Product();
		System.out.println("��ǰ �ڵ� : ");
		int code = Integer.parseInt(sc.nextLine()); // sc.nextLine()���ϰ� �ٷ��Ҽ� �� ����
		System.out.println("��ǰ �� : ");
		String name =sc.nextLine();
		System.out.println("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("��ǰ ���� : ");
		String desc = sc.nextLine();
		p.setCode(code);
		p.setName(name);
		p.setPrice(price);
		p.setDesc(desc);
		System.out.println(p);
		return p;
	}
	public void deleteProduct(){
		System.out.println("������ ��ǰ �ڵ� : ");
		int code = Integer.parseInt(sc.nextLine());
		int index = -1;
		for(int i=0; i<pList.size(); i++){
			index = i;
		}
		if(index != -1) pList.remove(index);
		else System.out.println("��ǰ�� �������� �ʾƿ�");
	}
	public void printAllproduct(){
		for(int i=0; i<pList.size(); i++){
			pList.get(i);
		}
		for(Product p : pList){
			System.out.println(p.getName());
		}
	}
}
