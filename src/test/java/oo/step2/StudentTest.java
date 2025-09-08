package oo.step2;

import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    // when introduce a student, then return a message with name and age
    @Test
    public void show_return_message_with_name_and_age() {
        Student student = new Student(1, "Tom", 20);
        assertEquals(student.introduce(), "My name is Tom. I am 20 years old. I am a student.");
    }
    // when equals two same id student then return true

    @Test
    public void should_return_true_when_equals_two_same_id_student() {
        Student student1 = new Student(1, "Tom", 20);
        Student student2 = new Student(1, "Tom", 20);
        assertTrue(student1.equals(student2));
    }
    // when equals two different id student then return true
    @Test
    public void should_return_false_when_equals_two_diff_id_student() {
        Student student1 = new Student(1, "Tom", 20);
        Student student2 = new Student(2, "Jack", 20);
        assertFalse(student1.equals(student2));
    }
}
