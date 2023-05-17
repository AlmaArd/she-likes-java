package com.sda.she_likes_java.homework.exercise_23;

import java.util.Objects;

public class Pupil {
    private String PupilName;
    private String PupilSurname;

    public Pupil(String pupilName, String pupilSurname) {
        PupilName = pupilName;
        PupilSurname = pupilSurname;
    }

    public String getPupilName() {
        return PupilName;
    }

    public String getPupilSurname() {
        return PupilSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pupil pupil = (Pupil) o;
        return PupilName.equals(pupil.PupilName) && PupilSurname.equals(pupil.PupilSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PupilName, PupilSurname);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "PupilName='" + PupilName + '\'' +
                ", PupilSurname='" + PupilSurname + '\'' +
                '}';
    }
}
