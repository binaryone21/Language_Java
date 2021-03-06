package seunghee.example._05_academy_class;

public class AcademyVO {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int sum;
    private double avg;
    private char grd;

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }

    public int getSum() {
        return sum;
    }

    public double getAvg() { return avg; }

    public char getGrd() {
        return grd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setAvg(double Avg) {
        this.avg = Avg;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public AcademyVO(String name, int kor, int eng, int mat, int sum, double avg, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = sum;
        this.avg = avg;
        this.grd = grd;
    }
}
