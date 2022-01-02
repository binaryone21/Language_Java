package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._01_제네릭;

public class _01_GenericPrinterTest {
    public static void main(String[] args) {
        _01_GenericPrinter<_01_Powder> powderPrinter = new _01_GenericPrinter<>();

        powderPrinter.setMaterial(new _01_Powder());
        _01_Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        _01_GenericPrinter<_01_Plastic> plasticPrinter = new _01_GenericPrinter<>();

        plasticPrinter.setMaterial(new _01_Plastic());
        _01_Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
    }
}
