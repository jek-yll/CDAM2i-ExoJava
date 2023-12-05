package org.example.demo_singelton;

public class Storage {

    private static volatile Storage instance = null;

    private Storage() {

    }

    public static Storage getInstance() {
        if (instance == null) {
            synchronized (Storage.class){
                instance = new Storage();
            }
        }
        return instance;
    }
}
