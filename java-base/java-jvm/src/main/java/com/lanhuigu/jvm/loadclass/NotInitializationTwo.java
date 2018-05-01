package com.lanhuigu.jvm.loadclass;

/**
 * 通过数组定义来引用类，不会触发此类的初始化
 * @author yihonglei
 * @ClassName: NotInitializationTwo
 * @Package: com.lanhuigu.jvm.loadclass
 * @date 2018/4/29 22:18
 * @version 1.0.0
 */
public class NotInitializationTwo {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}