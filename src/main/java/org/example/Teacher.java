package org.example;

public class Teacher {
    private String name;
    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public void teach(Student student) {
        student.learnSubject(subject);
    }

    public void teach(Student[] students) {
        for (Student student : students) {
            teach(student);
        }
    }
}



