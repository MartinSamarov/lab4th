package ssv.example;

public class Grade {
    private Student student;
    private Assignment assignment;
    private int gradeValue;

    public Grade(Student student, Assignment assignment, int gradeValue) {
        this.student = student;
        this.assignment = assignment;
        this.gradeValue = gradeValue;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(int gradeValue) {
        this.gradeValue = gradeValue;
    }
}
