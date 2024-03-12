package org.example;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("John", Subject.MATHS);
        Teacher englishTeacher = new Teacher("Alice", Subject.LITERATURE);

        Student student1 = new Student("Bob");
        Student student2 = new Student("Alice");

        Student[] students = {student1, student2};

        mathTeacher.teach(students);
        englishTeacher.teach(student1);

        System.out.println(student1.knowsSubject(Subject.MATHS)); // Output: true
        System.out.println(student2.knowsSubject(Subject.LITERATURE)); // Output: true
        System.out.println(student2.knowsSubject(Subject.PHYSICS)); // Output: false
    }
}