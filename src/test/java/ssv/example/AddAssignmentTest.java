package ssv.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AddAssignmentTest {

    @Test
    void testAddAssignment() {
        AssignmentRepository assignmentRepository = Mockito.mock(AssignmentRepository.class);
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);

        GradingSystem gradingSystem = new GradingSystem(studentRepository, assignmentRepository, null);

        Student student = new Student("John Doe");
        Assignment assignment = new Assignment("Homework 1");

        when(assignmentRepository.add(student, assignment)).thenReturn(true);

        boolean result = gradingSystem.addAssignment(student, assignment);

        assertTrue(result);
        verify(assignmentRepository, times(1)).add(student, assignment);
    }
}
