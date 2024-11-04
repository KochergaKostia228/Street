package src.com.company.model;

import com.company.server.school.print.PrintSchoolInterface;

public class School extends House{
    private int numberOfStudents;
    private AccreditationLevel level;
    private PrintSchoolInterface print;

    public School(String adress, AccreditationLevel level, int numberOfStudents) {
        super(adress);
        this.level = level;
        this.numberOfStudents = numberOfStudents;
    }

    public School(String adress, int numberOfStudents, AccreditationLevel level, PrintSchoolInterface print) {
        this(adress, level, numberOfStudents);
        this.print = print;
    }

    @Override
    public void print() {
        print.printSchool(this);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public AccreditationLevel getLevel() {
        return level;
    }

    public void setLevel(AccreditationLevel level) {
        this.level = level;
    }

    public PrintSchoolInterface getPrint() {
        return print;
    }

    public void setPrint(PrintSchoolInterface print) {
        this.print = print;
    }
}
