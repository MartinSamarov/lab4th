package ssv.example;

public class GradingSystem {
    private StudentRepository studentRepository;
    private AssignmentRepository assignmentRepository;
    private GradeRepository gradeRepository;

    public GradingSystem(StudentRepository studentRepository, AssignmentRepository assignmentRepository, GradeRepository gradeRepository) {
        this.studentRepository = studentRepository;
        this.assignmentRepository = assignmentRepository;
        this.gradeRepository = gradeRepository;
    }

    public boolean addStudent(Student student) {
        return studentRepository.add(student);
    }

    public boolean addAssignment(Student student, Assignment assignment) {
        return assignmentRepository.add(student, assignment);
    }

    public boolean addGrade(Grade grade) {
        return gradeRepository.add(grade);
    }
}
