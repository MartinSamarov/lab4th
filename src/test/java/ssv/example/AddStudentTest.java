package ssv.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AddStudentTest {

    @Test
    void testAddStudent() {
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);

        GradingSystem gradingSystem = new GradingSystem(studentRepository, null, null);

        Student student = new Student("John Doe");

        when(studentRepository.add(student)).thenReturn(true);

        boolean result = gradingSystem.addStudent(student);

        assertTrue(result);
        verify(studentRepository, times(1)).add(student);
    }
}
