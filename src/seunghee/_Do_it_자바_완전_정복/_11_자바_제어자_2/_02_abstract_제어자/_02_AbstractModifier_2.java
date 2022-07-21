package seunghee._Do_it_자바_완전_정복._11_자바_제어자_2._02_abstract_제어자;

abstract class _02_Animal {
    abstract  void cry();
}

class _02_Cat extends _02_Animal {
    void cry() {
        System.out.println("야옹");
    }
}

class _02_Dog extends _02_Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

public class _02_AbstractModifier_2 {
    public static void main(String[] args) {
        // 객체 생성
        _02_Animal animal1 = new _02_Cat();
        _02_Animal animal2 = new _02_Dog();

        // 메서드 호출
        animal1.cry();
        animal2.cry();
    }
}
