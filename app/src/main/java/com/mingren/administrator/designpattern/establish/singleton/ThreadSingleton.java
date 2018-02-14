package com.mingren.administrator.designpattern.establish.singleton;

/**
 * 处理线程的单例
 */

public class ThreadSingleton {
    private static ThreadSingleton threadSingleton = null;

    private ThreadSingleton() {
    };

    // 为初始化单例加锁
    private static void initThreadSingleton() {
        threadSingleton = new ThreadSingleton();
    }

    // 公有的获取方法
    public static synchronized ThreadSingleton getInstance() {
        if (threadSingleton == null) {
            initThreadSingleton();
        }
        return threadSingleton;
    }
}
