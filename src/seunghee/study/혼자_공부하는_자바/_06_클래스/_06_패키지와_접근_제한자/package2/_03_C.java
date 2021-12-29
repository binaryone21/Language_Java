package seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.package2;

import seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.package1._03_A;

public class _03_C {
	public _03_C() {
		_03_A a = new _03_A();
		a.field1 = 1;
		/* a.field2 = 1; */
		/* a.field3 = 1; */
		
		a.method1();
		/* a.method2(); */
		/* a.method3(); */
	}
}
