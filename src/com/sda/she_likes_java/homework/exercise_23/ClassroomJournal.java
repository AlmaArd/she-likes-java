package com.sda.she_likes_java.homework.exercise_23;
// Create a lesson journal:
//- it should provide 3 methods
//- provide a list of pupils
//- provide a list of subjects
//- provide the pupil’s grades in the subject.
//Think about what classes you will need.
//What structures will you use to store the data: list, map, set.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClassroomJournal {

    private List<Pupil> pupils;
    public ClassroomJournal(){this.pupils = new ArrayList<>();
        this.subjects = new ArrayList<>();}
    public void addPupilToList(Pupil pupilList) {
        pupils.add(pupilList);
    }
    public void displayPupilList(){
        System.out.println("Here are pupils list" + pupils);
    }

    private List<Subject> subjects;
    //public LessonJournalSubject(){this.subjects = new ArrayList<>();}

    public void addSubjectList(Subject subjectList){
        subjects.add(subjectList);
    }
    public void displaySubjectsList(){
        System.out.println("Here are subjects list" + subjects);
    }
    public static void pupilGradeInSubject(Map<Pupil, Grade> pupilGradeMap){

        for (Map.Entry<Pupil,Grade> item: pupilGradeMap.entrySet()){
            System.out.println("Key " + item.getKey());
            System.out.println("Value:" + item.getValue());
        }

    }
}

