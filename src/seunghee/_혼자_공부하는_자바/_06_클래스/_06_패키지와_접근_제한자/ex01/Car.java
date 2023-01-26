package seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex01;

import seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex01.hankook.*;
import seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex01.hyundai.Engine;
import seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex01.kumho.*;

public class Car {
	// 필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex01.hankook.Tire tire3 = new seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex01.hankook.Tire();
	seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex01.kumho.Tire tire4 = new seunghee._혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자.ex01.kumho.Tire();
}
