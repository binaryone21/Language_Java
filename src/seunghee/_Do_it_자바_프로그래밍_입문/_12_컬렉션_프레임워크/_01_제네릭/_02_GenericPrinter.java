package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._01_제네릭;

public class _02_GenericPrinter<T> extends _02_Material {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

    @Override
    public void doPrinting() { }
}
