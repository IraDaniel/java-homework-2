package com.company.task6;

/**
 * Created by Ira on 09.12.2015.
 */
@AnnotationSubmarine
public class NuclearSubmarine {
    EngineNuclearSubmarine engineNuclearSubmarine;
    class EngineNuclearSubmarine{
        void run(){
            System.out.println("Start engine and go!");
        }
    }
    public void run(){
        engineNuclearSubmarine.run();
    }

    public NuclearSubmarine() {
        engineNuclearSubmarine = new EngineNuclearSubmarine();
    }
}
