package seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex02;

public class ArrayTest2 {
	public static void main(String[] args) {
		double[] data = new double[5];
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
