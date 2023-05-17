package com.sda.she_likes_java.homework.exercise_23;

import java.util.Objects;

public class Grade {
    private int subjectGrade;

    public Grade(int productPrice) {
        this.subjectGrade = productPrice;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "productPrice=" + subjectGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return subjectGrade == grade.subjectGrade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectGrade);
    }

    public int getSubjectGrade() {
        return subjectGrade;
    }
}
