package seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._04_Class_클래스;

public class _01_Person {
    private String name;
    private int age;

    public _01_Person() {}

    public _01_Person(String name) {
        this.name = name;
    }

    public _01_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
