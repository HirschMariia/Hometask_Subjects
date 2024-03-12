package org.example;

public class Student {
    private String name;
    private Subject[] learnedSubjects;

    public Student(String name) {
        this.name = name;
        this.learnedSubjects = new Subject[0];
    }

    public void learnSubject(Subject subject) {
        Subject[] temp = new Subject[learnedSubjects.length + 1];
        System.arraycopy(learnedSubjects, 0, temp, 0, learnedSubjects.length);
        temp[temp.length - 1] = subject;
        learnedSubjects = temp;
    }

    public boolean knowsSubject(Subject subject) {
        for (Subject s : learnedSubjects) {
            if (s == subject) {
                return true;
            }
        }
        return false;
    }
}

