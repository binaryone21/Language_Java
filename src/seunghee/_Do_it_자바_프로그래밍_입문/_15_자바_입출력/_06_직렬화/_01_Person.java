package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화;

import java.io.Serializable;

public class _01_Person implements Serializable {
    private static final long serialVersionUID = -150323524025446183L;
    String name;
    String job;

    public _01_Person() { }

    public _01_Person(String name, String job) {
        this.name = name;
        this.job =job;
    }

    public String toString() {
        return name + ", " + job;
    }
}
