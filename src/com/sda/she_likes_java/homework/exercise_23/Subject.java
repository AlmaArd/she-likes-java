package com.sda.she_likes_java.homework.exercise_23;

import java.util.Objects;

public class Subject {
    private String LessonName;

    public Subject(String lessonName) {
        LessonName = lessonName;
        }

    @Override
    public String toString() {
        return "Subject{" +
                "LessonName='" + LessonName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return LessonName.equals(subject.LessonName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LessonName);
    }

    public String getLessonName() {
        return LessonName;
    }
}

