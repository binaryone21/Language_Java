package seunghee.example._05_academy_class;

public class Academy {
    public static void main(String[] args) {
        AcademyService ser = new AcademyService();
        AcademyDAO dao = new AcademyDAO();

        // 성적 입력받기
        AcademyVO person = ser.setAcademyVO();
        // 성적 계산하기
        ser.computeAcademy(person);
        // 성적 출력하기
        dao.printAcademy(person);


        // 여러 성적 입력받기
        AcademyVO[] persons = new AcademyVO[2];
        for(int i=0; i<persons.length; i++) {
            persons[i] = ser.setAcademyVO();
        }
        for(int i=0; i<persons.length; i++) {
            ser.computeAcademy(persons[i]);
        }
        for(int i=0; i<persons.length; i++) {
            dao.printAcademy(persons[i]);
        }
    }
}
