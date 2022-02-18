package ca.upei.softwaredesign.p1;

import java.util.ArrayList;

public class Course {
    private GradingPolicy gradePolicy;
    private ArrayList<CourseTaker> studentList = new ArrayList<>();

    private String name;
    private String number;

    public GradingPolicy getGradePolicy() {
        return gradePolicy;
    }

    public void setGradePolicy(GradingPolicy gradePolicy) {
        this.gradePolicy = gradePolicy;
    }


    public Course(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getCourseName(){
        return name;
    } //getter for name

    public void addStudent (Student student){
        studentList.add(student);
    } //add 1 student


    public double getGrade(CourseTaker student) {
        if(gradePolicy==null)
            throw new RuntimeException("Grade policy cannot be null");
        if(student==null){
            throw new RuntimeException("ca.upei.softwaredesign.p1.Student cannot be null");
        }
        return gradePolicy.finalGrade(student, this);
    }
}