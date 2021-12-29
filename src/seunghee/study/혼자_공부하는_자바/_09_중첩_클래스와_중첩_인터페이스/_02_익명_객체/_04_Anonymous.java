package seunghee.study.혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._02_익명_객체;

public class _04_Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// arg1 = 20;
		// arg2 = 20;
		
		// var1 = 30;
		// var2 = 30;
		
		_04_Calculatable calc = new _04_Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
