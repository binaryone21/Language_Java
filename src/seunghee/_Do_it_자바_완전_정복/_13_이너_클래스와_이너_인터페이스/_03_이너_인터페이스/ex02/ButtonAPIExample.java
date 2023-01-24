package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._03_이너_인터페이스.ex02;

class Button {
    OnClickListener ocl;
    void setOnClickListener (OnClickListener ocl) {
        this.ocl = ocl;
    }
    interface OnClickListener {
        public abstract void onClick();
    }
    void onClick() {
        ocl.onClick();
    }
}

public class ButtonAPIExample {
    public static void main(String[] args) {
        // 개발자 1. 클릭하면 음악 재생
        Button btn1 = new Button();
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("개발자 1: 음악 재생");
            }
        });
        btn1.onClick();

        // 개발자 2. 클릭하면 네이버 접속
        Button btn2 = new Button();
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("개발자 2: 네이버 접속");
            }
        });
        btn2.onClick();
    }
}
