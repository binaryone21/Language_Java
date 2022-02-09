package seunghee._혼자_공부하는_자바._14_입출력_스트림._03_입출력_관련_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_ProductStorage {
	private List<_02_Product> list = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료");
			System.out.println("-------------------------");
			
			System.out.print("선택 : ");
			String selectNo = scanner.nextLine();
			switch(selectNo) {
				case "1" : registerProduct(); break;
				case "2" : showProducts(); break;
				case "3" : return;
			}
			
		}
	}
	
	public void registerProduct() {
		try {
			_02_Product product = new _02_Product();
			product.setPno(++counter);
			
			System.out.print("상품명 : ");
			product.setName(scanner.nextLine());
			
			System.out.print("가격 : ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("재고 : ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
		} catch(Exception e) {
			System.out.println("등록 에러 : " + e.getMessage());
		}
	}
	
	public void showProducts() {
		for(_02_Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
}
