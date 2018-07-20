package ex02.produ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
	Scanner sc = new Scanner(System.in);
	List <Product> pList = new ArrayList<Product>();
	public void start(){
		while(true){
			System.out.println("1.상품추가 | 2.상품삭제 | 3. 상품조회 | 4. 모든 상품명 조회");
			int userSel = Integer.parseInt(sc.nextLine());
			if(userSel == 1) addProduct();
			else if(userSel ==2) deleteProduct();
			else if(userSel == 4) printAllproduct();
		}
	}
	
	public Product addProduct(){
		Product p = new Product();
		System.out.println("상품 코드 : ");
		int code = Integer.parseInt(sc.nextLine()); // sc.nextLine()안하고 바로할수 도 있음
		System.out.println("상품 명 : ");
		String name =sc.nextLine();
		System.out.println("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("상품 설명 : ");
		String desc = sc.nextLine();
		p.setCode(code);
		p.setName(name);
		p.setPrice(price);
		p.setDesc(desc);
		System.out.println(p);
		return p;
	}
	public void deleteProduct(){
		System.out.println("삭제할 상품 코드 : ");
		int code = Integer.parseInt(sc.nextLine());
		int index = -1;
		for(int i=0; i<pList.size(); i++){
			index = i;
		}
		if(index != -1) pList.remove(index);
		else System.out.println("상품이 존재하지 않아요");
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
