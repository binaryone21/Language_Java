package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._01_제네릭.ex02;

public class Powder extends Material {
    @Override
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }

    public String toString() {
        return "재료는 Powder입니다.";
    }
}
