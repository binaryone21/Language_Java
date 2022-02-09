package seunghee.study._Do_It_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스;

public class _01_ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        _01_Person person = new _01_Person();
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        Class pClass2 = _01_Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스._01_Person");
        System.out.println(pClass3.getName());
    }
}
