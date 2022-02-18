package ca.upei.softwaredesign.p1;

public class SimplePolicy extends GradingPolicy{
    @Override
    public double finalGrade(CourseTaker s, Course c) {
        if(s == null)
            throw new RuntimeException("ca.upei.softwaredesign.p1.Student cannot be null");
        if(c == null)
            throw new RuntimeException("ca.upei.softwaredesign.p1.Course cannot be null");

        Double exams = super.examAvg(s,c) * EXAM_WEIGHT;
        Double assignments = super.asAvg(s,c) * ASSIGNMENT_WEIGHT ;
        return exams+assignments;
    }
}
