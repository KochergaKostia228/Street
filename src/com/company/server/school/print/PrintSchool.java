package src.com.company.server.school.print;

import src.com.company.model.School;

public class PrintSchool implements PrintSchoolInterface{
    @Override
    public void printSchool(School school) {
        System.out.println("--------------------School-------------------------");
        System.out.println("Adress: " + school.getAdress());
        System.out.println("Number students: " + school.getNumberOfStudents());
        System.out.println("Acreditation: " + school.getLevel());
    }
}
