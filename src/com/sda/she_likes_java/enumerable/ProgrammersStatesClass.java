package com.sda.she_likes_java.enumerable;

public class ProgrammersStatesClass {
    public static final ProgrammersStatesClass GOD_MODE =
            new ProgrammersStatesClass("I can do everything:)");
    public static final ProgrammersStatesClass EXHAUSTED =
            new ProgrammersStatesClass("Bang the wall:(");
    public static final ProgrammersStatesClass NORMAL =
            new ProgrammersStatesClass("yeah it's just life");
   // private static ProgrammersStatesClass [] value () {}
  //  ProgrammersStatesClass [] value = new ProgrammersStatesClass[3];
  //  value[0] = GOD_MODE;
 //  value[1] =  EXHAUSTED;
   // value[2] =  NORMAL;
    //

    String description;

    public String getDescription() {
        return description;
    }

    private ProgrammersStatesClass(String description) {
        this.description = description;
    }
}
