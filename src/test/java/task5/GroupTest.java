package test.java.task5;

import com.company.task5.CompareEvaluation;
import com.company.task5.Group;
import com.company.task5.Subject;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Ira on 15.12.2015.
 */
public class GroupTest {
    @Test
    public void testGroup() {

        ArrayList<String> tStudent = new ArrayList<>();
        tStudent.add("Ivanov"); // имя уникально
        tStudent.add("Petrov");


        ArrayList<Group<Double>> dGroups = new ArrayList<>(); // массив дисциплин с оценкой типа double
        dGroups.add(0, new Group<>(Subject.HISTORY));
        dGroups.get(0).addStudent(tStudent.get(0), 0.5);
        dGroups.get(0).addStudent(tStudent.get(1), 0.5);
        //  dGroups.get(0).showAllStudents();
        dGroups.add(1, new Group<>(Subject.LITERATURE));
        dGroups.get(1).addStudent(tStudent.get(0), 0.6);

        ArrayList<Group<Integer>> iGroups = new ArrayList<>(); // массив дисциплин с оценкой типа integer
        iGroups.add(0, new Group<>(Subject.PROGRAMMING));
        iGroups.get(0).addStudent(tStudent.get(0), 100);


        CompareEvaluation compareEvaluation = new CompareEvaluation(dGroups, iGroups);
        compareEvaluation.findStudentResult(tStudent.get(0));
    }
}
