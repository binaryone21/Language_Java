package seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스;

public class _03_NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        _01_Person p1 = new _01_Person();
        System.out.println(p1);

        Class pClass = Class.forName("seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스._01_Person");
        _01_Person p2 = (_01_Person) pClass.newInstance();
        System.out.println(p2);
    }
}
