package ssv.example;

import java.util.ArrayList;
import java.util.List;

public class InMemoryGradeRepository implements GradeRepository {
    private List<Grade> grades;

    public InMemoryGradeRepository() {
        this.grades = new ArrayList<>();
    }

    @Override
    public boolean add(Grade grade) {
        // Add the grade to the list of grades
        boolean isAdded = grades.add(grade);
        return isAdded; // Return true if the grade was added successfully
    }
}
