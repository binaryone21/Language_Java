package seunghee.example._05_academy_class;

public class AcademyDAO {
    void printAcademy(AcademyVO person) {
        String fmt = ("\n이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n" +
                "----------\n총점 : %d\n평균 : %.2f\n학점 : %c\n");
        System.out.printf(fmt, person.getName(), person.getKor(), person.getEng(),
                person.getMat(), person.getSum(), person.getAvg(), person.getGrd());
    }
}
