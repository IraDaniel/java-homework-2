package com.company.task5;

import java.util.*;

/**
 * Created by Ira on 09.12.2015.
 */
public class CompareEvaluation {

    ArrayList<Group<Double>> dGroups = new ArrayList<>();
    ArrayList<Group<Integer>> iGroups = new ArrayList<>();


    public CompareEvaluation(ArrayList<Group<Double>> dGroups, ArrayList<Group<Integer>> iGroups) {
        this.dGroups = dGroups;
        this.iGroups = iGroups;
    }


    public void findStudentResult(String name){
        System.out.println("Student name:" + name);

        Map<Subject,Double> subjectDoubleMap = new HashMap<>();
        Map<Subject,Integer> subjectIntegerMap = new HashMap<>();

        /**
         * ����� �� ������� � ����� ����������� double � ���� ��������
         * ���� ����, �� ���������� � subjectDoubleMap
         */

        for(Group<Double> indexDGroup: dGroups){
           if (indexDGroup.getEvalByName(name) == null){
               continue;
           }else{
               subjectDoubleMap.put(indexDGroup.getSubject(),indexDGroup.getEvalByName(name) );
           }
        }
        /*
        * ��������������� map �� ������, �� ������� �� �����
        *
        */
        if(!subjectDoubleMap.isEmpty()){
            System.out.println(subjectDoubleMap);
            double max1 = Collections.max(subjectDoubleMap.values());

            for(Subject s: subjectDoubleMap.keySet()){
                if(subjectDoubleMap.get(s) == max1){
                    System.out.println(s + ":" + max1);
                }
            }
        }



        /**
         * ����� �� ������� � ����� ����������� integer � ���� ��������
         * ���� ����, �� ���������� � subjectDoubleMap
         */
        for(Group<Integer> indexIGroup: iGroups){
            if (indexIGroup.getEvalByName(name) == null){
                continue;
            }else{
                subjectIntegerMap.put(indexIGroup.getSubject(), indexIGroup.getEvalByName(name) );
            }
        }
        if(! subjectIntegerMap.isEmpty()){
            System.out.println(subjectIntegerMap);
            int max2 = Collections.max(subjectIntegerMap.values());
            for(Subject s: subjectIntegerMap.keySet()){
                if(subjectIntegerMap.get(s) == max2){
                    System.out.println(s + ":" + max2);
                }
            }
        }




    }
}
