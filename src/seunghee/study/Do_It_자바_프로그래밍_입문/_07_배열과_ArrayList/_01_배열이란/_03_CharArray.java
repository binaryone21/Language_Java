package seunghee.study.Do_It_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란;

public class _03_CharArray {
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
