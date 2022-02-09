package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기;

import java.util.ArrayList;

public class _03_Shelf {
	protected ArrayList<String> shelf;
	
	public _03_Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
