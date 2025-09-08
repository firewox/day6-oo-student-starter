package oo.step2;

import oo.Person;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    // when introduce a person of student then return message with name and age
    @Test
    public void show_return_message_with_name_and_age_when_introdude_a_person_of_student() {
        Person student = new Student(1, "Tom", 20);
        assertThat(student.introduce()).isEqualTo("My name is Tom. I am 20 years old. I am a student.");
    }
    // when introduce a person of teacher then return message with name and age
    @Test
    public void show_return_message_with_name_and_age_when_introdude_a_person_of_teacher() {
        Person teacher = new Teacher(2, "Tom", 20);
        assertThat(teacher.introduce()).isEqualTo("My name is Tom. I am 20 years old. I am a teacher.");
    }
}
