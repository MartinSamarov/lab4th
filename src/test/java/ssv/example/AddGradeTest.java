package ssv.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AddGradeTest {

    @Test
    void testAddGrade() {
        GradeRepository gradeRepository = Mockito.mock(GradeRepository.class);

        GradingSystem gradingSystem = new GradingSystem(null, null, gradeRepository);

        Student student = new Student("John Doe");
        Assignment assignment = new Assignment("Math Exam");
        Grade grade = new Grade(student, assignment, 90);

        when(gradeRepository.add(grade)).thenReturn(true);

        boolean result = gradingSystem.addGrade(grade);

        assertTrue(result);
        verify(gradeRepository, times(1)).add(grade);
    }
}
