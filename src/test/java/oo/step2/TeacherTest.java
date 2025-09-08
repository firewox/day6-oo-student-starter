package oo.step2;

import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    // when introduce a teacher, then return a message with name and age
    @Test
    public void should_return_message_with_name_and_age() {
        Teacher teacher = new Teacher(1, "Jack", 50);
        assertEquals(teacher.introduce(), "My name is Jack. I am 50 years old. I am a teacher.");
    }
    // when equals two same id teacher then return true
    @Test
    public void should_return_true_when_equals_two_same_id_teacher() {
        Teacher teacher1 = new Teacher(1, "Jack", 50);
        Teacher teacher2 = new Teacher(1, "Jack", 50);
        assertTrue(teacher1.equals(teacher2));
    }
    // when equals two different id teacher then return false
    @Test
    public void should_return_false_when_equals_two_different_id_teacher() {
        Teacher teacher1 = new Teacher(1, "Jack", 50);
        Teacher teacher2 = new Teacher(2, "Tom", 50);
        assertFalse(teacher1.equals(teacher2));
    }
}
