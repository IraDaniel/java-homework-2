package com.company.task5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ira on 08.12.2015.
 */
public class Group <T extends Number>{

    private Subject subject;

    private Map<String,T> tMap = new HashMap<String, T >();

    public Group(Subject subject) {
        this.subject = subject;
    }

    public boolean addStudent(String name, T eval){
        int size1 = tMap.size();
        tMap.put(name,eval);
        // проверка на то, что добавили
        if(size1 < tMap.size()) return true;
        else return false;

    }
    // получить оценку по имени
    public T getEvalByName(String name){
        T value = tMap.get(name);
       // System.out.println(value);
        return value;
    }
    public void showAllStudents(){
        System.out.println(tMap);
    }

    public Subject getSubject() {
        return subject;
    }

   // public Group<T> getGroupBySubject()
}

