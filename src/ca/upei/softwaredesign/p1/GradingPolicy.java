package ca.upei.softwaredesign.p1;

import java.util.ArrayList;
public abstract class GradingPolicy {
    public static final double ASSIGNMENT_WEIGHT = 0.4;
    public static final double EXAM_WEIGHT = 0.6;
    public static final int PASSING_GRADE = 50;
    public static final int MAX_FAIL_GRADE = 45;
    public double examAvg(CourseTaker s, Course c){
        if(s == null)
            throw new RuntimeException("ca.upei.softwaredesign.p1.Student cannot be null");
        if(c == null)
            throw new RuntimeException("ca.upei.softwaredesign.p1.Course cannot be null");
        ArrayList<Double> scores = s.getExamScore().get(c);
        if(scores == null)
            throw new RuntimeException("The course exams cannot be null");
        if(scores.size() == 0)
            throw new RuntimeException("The course exams cannot be empty");

        double sum = 0;

        for(Double value : scores){
            sum += value;
        }
        return sum / scores.size();
    }

    public double asAvg(CourseTaker s, Course c){
        if(s == null)
            throw new RuntimeException("ca.upei.softwaredesign.p1.Student cannot be null");
        if(c == null)
            throw new RuntimeException("ca.upei.softwaredesign.p1.Course cannot be null");
        ArrayList<Double> scores = s.getAssignmentScore().get(c);
        if(scores == null)
            throw new RuntimeException("The course assignments cannot be null");
        if(scores.size() == 0)
            throw new RuntimeException("The course assignments cannot be empty");
        double sum = 0;
        for(Double value : scores){
            sum += value;
        }
        return sum / scores.size();
    }
    public abstract double finalGrade(CourseTaker s, Course c);

}