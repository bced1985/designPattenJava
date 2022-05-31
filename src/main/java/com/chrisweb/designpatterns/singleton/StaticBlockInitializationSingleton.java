package com.chrisweb.designpatterns.singleton;

public class StaticBlockInitializationSingleton {
    private static StaticBlockInitializationSingleton instance;

    private StaticBlockInitializationSingleton() {

    }
    static {
        try {
            instance = new StaticBlockInitializationSingleton();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    public static StaticBlockInitializationSingleton getInstance() {
        System.out.println("Static block init of the class");
        return instance;
    }

}
