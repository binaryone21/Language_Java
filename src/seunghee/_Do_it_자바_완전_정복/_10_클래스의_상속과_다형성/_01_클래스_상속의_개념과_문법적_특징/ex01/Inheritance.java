package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._01_클래스_상속의_개념과_문법적_특징.ex01;

class Human {
    String name;
    int age;
    void eat() {}
    void sleep() {}
}

class Student extends Human {
    int studentID;
    void goToShcool() {}
}

class Worker extends Human {
    int workerID;
    void goToWork() {}
}

public class Inheritance {
    public static void main(String[] args) {
        // Human 객체 생성
        Human h = new Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        // Student 객체 생성
        Student s = new Student();
        s.name = "김민성";
        s.age = 16;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToShcool();

        // Worker 객체 생성
        Worker w = new Worker();
        w.name = "봉윤정";
        w.age = 45;
        w.workerID = 128;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
