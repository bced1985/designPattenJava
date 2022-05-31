package com.chrisweb.designpatterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
            System.out.println("Create safe new Instance");
            return instance;
        }
        System.out.println("Returning Thread safe Instance");
        return instance;
    }

    public static ThreadSafeSingleton getDoubleCheckThreadSafeInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                    System.out.println("Create safe double check new Instance");
                }
            }
            return instance;
        }
        System.out.println("Returning Thread safe double check Instance");
        return instance;
    }
}
