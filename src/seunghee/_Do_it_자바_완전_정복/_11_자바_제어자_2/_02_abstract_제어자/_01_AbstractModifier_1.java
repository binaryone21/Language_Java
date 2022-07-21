package seunghee._Do_it_자바_완전_정복._11_자바_제어자_2._02_abstract_제어자;

class _01_Animal {
    void cry() {}
}

class _01_Cat extends _01_Animal {
    void cry() {
        System.out.println("야옹");
    }
}

class _01_Dog extends _01_Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

public class _01_AbstractModifier_1 {
    public static void main(String[] args) {
        // 객체 생성
        _01_Animal animal1 = new _01_Cat();
        _01_Animal animal2 = new _01_Dog();

        // 메서드 호출
        animal1.cry();  // 야옹
        animal2.cry();  // 멍멍
    }
}
