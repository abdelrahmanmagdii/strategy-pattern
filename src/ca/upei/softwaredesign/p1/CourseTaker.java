package ca.upei.softwaredesign.p1;

import java.util.ArrayList;
import java.util.HashMap;

interface CourseTaker
{

    HashMap<Course, ArrayList<Double>> getExamScore();

    HashMap<Course, ArrayList<Double>> getAssignmentScore();
}