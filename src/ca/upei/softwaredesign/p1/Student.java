package ca.upei.softwaredesign.p1;

import java.util.ArrayList;
import java.util.HashMap;

public class Student implements CourseTaker{
    private String name;
    private HashMap<Course,ArrayList<Double>> assignmentScore = new HashMap<>();
    private HashMap<Course,ArrayList<Double>> examScore = new HashMap<>();
//    ArrayList<Double> assignmentScore = new ArrayList<>();
//    ArrayList<Double> examScore = new ArrayList<>();
//    ArrayList<ca.upei.softwaredesign.p1.Course> courses = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    public void addAssignmentScore (Course course, double aScore){
        if(!assignmentScore.containsKey(course)){
            ArrayList<Double> scores = new ArrayList<>();
            assignmentScore.put(course,scores);
        }
        ArrayList<Double> scores = assignmentScore.get(course);
        scores.add(aScore);
    }

    @Override
    public HashMap<Course, ArrayList<Double>> getAssignmentScore() {
        return assignmentScore;
    }

    @Override
    public HashMap<Course, ArrayList<Double>> getExamScore() {
        return examScore;
    }

    public void addExamScore (Course course, double aScore){
        if(!examScore.containsKey(course)){
            ArrayList<Double> scores = new ArrayList<>();
            examScore.put(course,scores);
        }
        ArrayList<Double> scores = examScore.get(course);
        scores.add(aScore);
    }
}
