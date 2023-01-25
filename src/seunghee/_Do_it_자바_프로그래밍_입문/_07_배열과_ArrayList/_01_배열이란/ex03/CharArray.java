package seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex03;

public class CharArray {
	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]+", "+(int)alphabets[i]);
		}
	}
}
