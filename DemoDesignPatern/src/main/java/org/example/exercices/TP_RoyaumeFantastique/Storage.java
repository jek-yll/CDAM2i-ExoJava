package org.example.exercices.TP_RoyaumeFantastique;


import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static Storage instance = null;
    private static Object lock = new Object();

    private List<Royaume> royaumes;

    private Storage() {
        royaumes = new ArrayList<>();
    }

    public static Storage getInstance(){
        if(instance == null){
            synchronized (lock){
                instance = new Storage();
            }
        }
        return instance;
    }
}
