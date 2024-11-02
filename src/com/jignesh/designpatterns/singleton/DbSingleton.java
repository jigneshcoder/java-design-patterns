package com.jignesh.designpatterns.singleton;

public class DbSingleton {
    private static class LazyLoader {
        static final DbSingleton INSTANCE = new DbSingleton();
    }
    private DbSingleton() {}

    public static DbSingleton getInstance() {
        return LazyLoader.INSTANCE;
    }
}
