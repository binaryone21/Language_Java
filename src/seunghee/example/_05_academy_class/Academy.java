package seunghee.example._05_academy_class;

public class Academy {
    public static void main(String[] args) {
        AcademyService srv = new AcademyService();
        AcademyDAO dao = new AcademyDAO();

        // 성적 입력받기
        AcademyVO person = srv.setAcademyVO();
        // 성적 계산하기
        srv.computeAcademy(person);
        // 성적 출력하기
        dao.printAcademy(person);


        // 여러 성적 입력받기
        AcademyVO[] persons = new AcademyVO[2];
        for(int i=0; i<persons.length; i++) {
            persons[i] = srv.setAcademyVO();
        }
        for(int i=0; i<persons.length; i++) {
            srv.computeAcademy(persons[i]);
        }
        for(int i=0; i<persons.length; i++) {
            dao.printAcademy(persons[i]);
        }
    }
}
