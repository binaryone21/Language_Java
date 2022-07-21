package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._06_최상위_클래스_Object;

import java.util.HashMap;

class _03_A {
    String name;
    _03_A(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.name == ((_03_A)obj).name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

class _03_B {
    String name;
    _03_B(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.name == ((_03_B)obj).name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}

public class _03_ObjectMethod_hashcode {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "데이터1");
        hm1.put(1, "데이터2");
        hm1.put(2, "데이터3");
        System.out.println(hm1);

        HashMap<_03_A, String> hm2 = new HashMap<>();
        hm2.put(new _03_A("첫 번째"), "데이터1");
        hm2.put(new _03_A("첫 번째"), "데이터2");
        hm2.put(new _03_A("두 번째"), "데이터3");
        System.out.println(hm2);

        HashMap<_03_B, String> hm3 = new HashMap<>();
        hm3.put(new _03_B("첫 번째"), "데이터1");
        hm3.put(new _03_B("첫 번째"), "데이터2");
        hm3.put(new _03_B("두 번째"), "데이터3");
        System.out.println(hm3);
    }
}
