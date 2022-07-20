package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._03_메서드_오버라이딩;

class _02_Animal {
    void cry() {}
}

class _02_Bird extends _02_Animal {
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}

class _02_Cat extends _02_Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class _02_Dog extends _02_Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class _02_MethodOverriding_2 {
    public static void main(String[] args) {
        // 각각의 타입으로 선언 + 각각의 타입으로 생성
        _02_Animal aa = new _02_Animal();
        _02_Bird bb = new _02_Bird();
        _02_Cat cc = new _02_Cat();
        _02_Dog dd = new _02_Dog();
        aa.cry();
        bb.cry();
        cc.cry();
        dd.cry();
        System.out.println();

        // Animal 타입으로 선언 + 자식 클래스 타입으로 생성
        _02_Animal ab = new _02_Bird();
        _02_Animal ac = new _02_Cat();
        _02_Animal ad = new _02_Dog();
        ab.cry();
        ac.cry();
        ad.cry();
        System.out.println();

        // 배열로 관리
        _02_Animal[] animals = {ab, ac, ad};
        for(_02_Animal animal : animals) {
            animal.cry();
        }
    }
}
