package oo;

public class Teacher extends Person {
    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return "My name is " + super.getName() + ". I am " + super.getAge() + " years old." + " I am a teacher.";
    }
}
