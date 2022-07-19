package seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._02_static_제어자;

class _04_A {
    int a;
    static int b;
    static {
        b = 5;  // 정적 필드의 초기화는 static {} 내에서 수행
        System.out.println("클래스 A가 로딩되었습니다!!");
    }
    _04_A() {
        a = 3;  // 인스턴스 필드 초기화는 일반적으로 생성자에서 수행
    }
}
public class _04_StaticInitialBlock {
    public static void main(String[] args) {
        System.out.println(_04_A.b);
    }
}
