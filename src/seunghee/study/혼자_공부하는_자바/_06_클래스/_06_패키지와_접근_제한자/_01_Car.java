package seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자;

import seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자._01_hankook.*;
import seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자._01_hyundai.Engine;
import seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자._01_kumho.*;

/*import seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.*;*/


public class _01_Car {
	// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자._01_hankook.Tire tire3 = new seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자._01_hankook.Tire();
	seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자._01_kumho.Tire tire4 = new seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자._01_kumho.Tire();
}
