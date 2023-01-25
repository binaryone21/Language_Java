package seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스.ex01;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스.Person");
        System.out.println(pClass3.getName());
    }
}
