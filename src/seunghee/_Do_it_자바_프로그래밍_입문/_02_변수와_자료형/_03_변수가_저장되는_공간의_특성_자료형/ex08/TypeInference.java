package seunghee._Do_it_자바_프로그래밍_입문._02_변수와_자료형._03_변수가_저장되는_공간의_특성_자료형.ex08;

public class TypeInference {
	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "reader.txt";
		System.out.println(str);
	}
}
