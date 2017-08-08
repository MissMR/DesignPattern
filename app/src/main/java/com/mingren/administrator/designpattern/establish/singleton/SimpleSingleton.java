package com.mingren.administrator.designpattern.establish.singleton;

/**
 * 简单单例，无线程保护
 * 无多线程时使用
 */
public class SimpleSingleton {
    // 私有唯一引用
   private static  SimpleSingleton simpleSingleton = null;
    // 私有构造方法
    private SimpleSingleton(){};
    // 公有获取方法
    public static SimpleSingleton getInstance(){
        if (simpleSingleton == null){
            simpleSingleton = new SimpleSingleton();
        }

        return  simpleSingleton;
    };


}
