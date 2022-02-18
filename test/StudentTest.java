import ca.upei.softwaredesign.p1.AdvancedPolicy;
import ca.upei.softwaredesign.p1.Course;
import ca.upei.softwaredesign.p1.SimplePolicy;
import ca.upei.softwaredesign.p1.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void mainTest(){
        Student jack = new Student("jack");
        Course math = new Course("Math","25");
        jack.addAssignmentScore(math,60);
        jack.addAssignmentScore(math,70);
        jack.addAssignmentScore(math,80);
        jack.addExamScore(math,30);
        jack.addExamScore(math,50);
        SimplePolicy policy1 = new SimplePolicy();
        math.setGradePolicy(policy1);
        double grade = math.getGrade(jack);
        System.out.println(grade);
        assertEquals(52,grade,0.01);
        AdvancedPolicy policy2 = new AdvancedPolicy();
        math.setGradePolicy(policy2);
        double grade2 = math.getGrade(jack);
        System.out.println(grade2);
        assertEquals(45,grade2,0.01);
    }

}