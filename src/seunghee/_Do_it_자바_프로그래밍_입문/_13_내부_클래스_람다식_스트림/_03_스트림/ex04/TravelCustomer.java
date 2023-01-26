package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._03_스트림.ex04;

public class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
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
