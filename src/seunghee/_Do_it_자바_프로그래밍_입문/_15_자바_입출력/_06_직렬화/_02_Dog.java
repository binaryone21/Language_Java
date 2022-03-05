package seunghee._Do_it_자바_프로그래밍_입문._15_자바_입출력._06_직렬화;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class _02_Dog implements Externalizable {
    String name;

    public _02_Dog() {}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws  IOException, ClassNotFoundException {
        name = in.readUTF();
    }

    public String toString() {
        return name;
    }
}
