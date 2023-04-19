package com.sda.she_likes_java.visibility.examples;

public class Robot {

    private String model;
    private String generation;


    private int xPossition;
    private int yPossition;

    public Robot(String model, String generation, int xPossition, int yPossition) {
        this.model = model;
        this.generation = generation;
        this.xPossition = xPossition;
        this.yPossition = yPossition;
    }

    public String createJavaProgram(){
        return """
                public class RoboJavaProgram {
                    public static void main() {
                    }
                }
                """;
    }
    private void doInternalTwiks() {
        System.out.println("very important stuff");
    }
    public void moveForward() {
        xPossition++;
        System.out.println("I'm moving forward");


    }

    public void  moveBackward(){
        yPossition--;
        System.out.println("I'm moving backward");

    }
    public void turnLeft(){
        System.out.println("I'm able to move right;)");

    }

    public void turnRight() {
        System.out.println("I'm able to move left:)");

    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", generation='" + generation + '\'' +
                ", xPossition=" + xPossition +
                ", yPossition=" + yPossition +
                '}';
    }
}
