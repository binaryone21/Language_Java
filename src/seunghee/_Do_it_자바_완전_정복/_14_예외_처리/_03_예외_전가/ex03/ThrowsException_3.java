package seunghee._Do_it_자바_완전_정복._14_예외_처리._03_예외_전가.ex03;

// 1. 하위 메서드에 직접 예외를 처리할 때
class A {
    void abc() {
        bcd();
    }
    void bcd() {
        try {
            Class cls = Class.forName("java.lang.Object");  // ClassNotFoundException
            Thread.sleep(1000);
        } catch(InterruptedException | ClassNotFoundException e) {
            // 예외 처리 구문
        }
    }
}

// 2. 예외를 호출 메서드로 전가할 때
class B {
    void abc() {
        try {
            bcd();  // InterruptedException
        } catch (InterruptedException | ClassNotFoundException e) {
            // 예외 처리 구문
        }
    }
    void bcd() throws InterruptedException, ClassNotFoundException {
        Class cls = Class.forName("java.lang.Object");  // ClassNotFoundException
        Thread.sleep(1000); // InterruptedException
    }
}
public class ThrowsException_3 {
    public static void main(String[] args) {

    }
}
