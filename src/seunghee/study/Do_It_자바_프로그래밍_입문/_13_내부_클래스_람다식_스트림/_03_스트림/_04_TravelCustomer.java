package seunghee.study.Do_It_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._03_스트림;

public class _04_TravelCustomer {
    private String name;
    private int age;
    private int price;

    public _04_TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "name : " + name + " age : " + age + " price : " + price;
    }
}
