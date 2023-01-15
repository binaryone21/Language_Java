package seunghee._Do_it_자바_완전_정복._16_제네릭._01_제네릭_클래스와_제네릭_인터페이스;

// Apple 클래스와 Apple 클래스를 담을 수 있는 Goods1 클래스
class _01_Apple {}
class _01_Goods1 {
    private _01_Apple apple = new _01_Apple();
    public _01_Apple getApple() {
        return apple;
    }
    public void setApple(_01_Apple apple) {
        this.apple = apple;
    }
}

// Pencil 클래스와 Pencil 클래스를 담을 수 있는 Goods2 클래스
class _01_Pencil {}
class _01_Goods2 {
    private _01_Pencil pencil = new _01_Pencil();
    public _01_Pencil getPencil() {
        return pencil;
    }
    public void setPencil(_01_Pencil pencil) {
        this.pencil = pencil;
    }
}

public class _01_ProblemBeforeGeneric {
    public static void main(String[] args) {
        // Goods1을 이용해 Apple 객체를 추가하거나 가져오기
        _01_Goods1 goods1 = new _01_Goods1();
        goods1.setApple(new _01_Apple());
        _01_Apple apple = goods1.getApple();

        // Goods2를 이용해 Pencil 객체를 추가하거나 가져오기
        _01_Goods2 goods2 = new _01_Goods2();
        goods2.setPencil(new _01_Pencil());
        _01_Pencil pencil = goods2.getPencil();
    }
}
