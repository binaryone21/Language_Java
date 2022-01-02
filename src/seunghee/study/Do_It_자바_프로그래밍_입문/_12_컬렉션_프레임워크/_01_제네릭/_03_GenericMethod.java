package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._01_제네릭;

public class _03_GenericMethod {
    public static <T, V> double makeRectable(_03_Point<T, V> p1, _03_Point<T, V> p2) {
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left;
        double height = top - bottom;

        return width * height;
    }

    public static void main(String[] args) {
        _03_Point<Integer, Double> p1 = new _03_Point<>(0, 0.0);
        _03_Point<Integer, Double> p2 = new _03_Point<>(10, 10.0);

        double rect = _03_GenericMethod.<Integer, Double>makeRectable(p1, p2);
        System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
    }
}
