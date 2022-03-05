package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._03_스트림;

import java.util.ArrayList;
import java.util.List;

public class _04_TravleTest {
    public static void main(String[] args) {
        _04_TravelCustomer customerLee = new _04_TravelCustomer("이순신", 40, 100);
        _04_TravelCustomer customerKim = new _04_TravelCustomer("김유신", 20, 100);
        _04_TravelCustomer customerHong = new _04_TravelCustomer("홍길동", 13, 50);

        List<_04_TravelCustomer> customerList = new ArrayList<>();

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customerList.stream()
                .map(c -> c.getName()).forEach(s -> System.out.println(s));

        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 여행 비용은 : " + total + "입니다.");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream()
                .filter(c -> c.getAge() >= 20)
                .map(c -> c.getName())
                .sorted()
                .forEach(s -> System.out.println(s));
    }
}
