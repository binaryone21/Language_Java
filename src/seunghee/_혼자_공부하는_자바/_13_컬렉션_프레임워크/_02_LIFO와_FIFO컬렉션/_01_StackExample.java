package seunghee._혼자_공부하는_자바._13_컬렉션_프레임워크._02_LIFO와_FIFO컬렉션;

import java.util.Stack;

public class _01_StackExample {
	public static void main(String[] args) {
		Stack<_01_Coin> coinBox = new Stack<_01_Coin>();
		
		coinBox.push(new _01_Coin(100));
		coinBox.push(new _01_Coin(50));
		coinBox.push(new _01_Coin(500));
		coinBox.push(new _01_Coin(10));
		
		while(!coinBox.isEmpty()) {
			_01_Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
