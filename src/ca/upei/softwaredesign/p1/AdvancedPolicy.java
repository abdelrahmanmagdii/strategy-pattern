package ca.upei.softwaredesign.p1;

public class AdvancedPolicy extends GradingPolicy{
    @Override
    public double finalGrade(CourseTaker s, Course c) {
        if(s == null)
            throw new RuntimeException("ca.upei.softwaredesign.p1.Student cannot be null");
        if(c == null)
            throw new RuntimeException("ca.upei.softwaredesign.p1.Course cannot be null");

        Double exams = super.examAvg(s,c) * EXAM_WEIGHT ;
        Double assignments = super.asAvg(s,c) * ASSIGNMENT_WEIGHT ;
        double grade = exams + assignments;
        if(super.examAvg(s,c)<PASSING_GRADE){
            if(grade<MAX_FAIL_GRADE){
                return grade;

            }else{
                return MAX_FAIL_GRADE;
            }
        }
        return grade;
    }
}
