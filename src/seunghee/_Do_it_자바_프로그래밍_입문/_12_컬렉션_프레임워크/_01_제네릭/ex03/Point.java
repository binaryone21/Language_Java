package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._01_제네릭.ex03;

public class Point<T, V> {
    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
