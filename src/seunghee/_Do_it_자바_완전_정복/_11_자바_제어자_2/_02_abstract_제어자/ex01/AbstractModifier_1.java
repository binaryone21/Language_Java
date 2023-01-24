package seunghee._Do_it_자바_완전_정복._11_자바_제어자_2._02_abstract_제어자.ex01;

class Animal {
    void cry() {}
}

class Cat extends Animal {
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

public class AbstractModifier_1 {
    public static void main(String[] args) {
        // 객체 생성
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        // 메서드 호출
        animal1.cry();  // 야옹
        animal2.cry();  // 멍멍
    }
}
