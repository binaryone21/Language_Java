package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._01_클래스_상속의_개념과_문법적_특징;

class _01_Human {
    String name;
    int age;
    void eat() {}
    void sleep() {}
}

class _01_Student extends _01_Human {
    int studentID;
    void goToShcool() {}
}

class _01_Worker extends _01_Human {
    int workerID;
    void goToWork() {}
}

public class _01_Inheritance {
    public static void main(String[] args) {
        // Human 객체 생성
        _01_Human h = new _01_Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        // Student 객체 생성
        _01_Student s = new _01_Student();
        s.name = "김민성";
        s.age = 16;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToShcool();

        // Worker 객체 생성
        _01_Worker w = new _01_Worker();
        w.name = "봉윤정";
        w.age = 45;
        w.workerID = 128;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
