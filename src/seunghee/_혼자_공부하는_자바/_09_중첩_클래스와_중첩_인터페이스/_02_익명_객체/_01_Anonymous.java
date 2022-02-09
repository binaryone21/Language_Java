package seunghee._혼자_공부하는_자바._09_중첩_클래스와_중첩_인터페이스._02_익명_객체;

public class _01_Anonymous {
	// 필드 초기값으로 대입
	_01_Person filed = new _01_Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		// 로컬 변수값으로 대입
		_01_Person localVar = new _01_Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		// 로컬 변수 사용
		localVar.wake();
	}
	
	void method2(_01_Person person) {
		person.wake();
	}
}
