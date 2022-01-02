package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._01_제네릭;

public class _02_GenericPrinterTest {
    public static void main(String[] args) {
        _02_GenericPrinter<_02_Powder> powderPrinter = new _02_GenericPrinter<>();

        powderPrinter.setMaterial(new _02_Powder());
        _02_Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        _02_GenericPrinter<_02_Plastic> plasticPrinter = new _02_GenericPrinter<>();

        plasticPrinter.setMaterial(new _02_Plastic());
        _02_Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
    }
}
