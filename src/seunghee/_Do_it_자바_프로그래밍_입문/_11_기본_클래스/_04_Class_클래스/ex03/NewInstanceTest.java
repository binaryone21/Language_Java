package seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스.ex03;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person p1 = new Person();
        System.out.println(p1);

        Class pClass = Class.forName("seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스.ex03.Person");
        Person p2 = (Person) pClass.newInstance();
        System.out.println(p2);
    }
}
