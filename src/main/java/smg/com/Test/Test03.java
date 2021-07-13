package smg.com.Test;

/**
 * Project Name: one2
 * File Name: Test03
 *
 * @version 1.0
 * @author:wenerduo
 * @Date: 2021/07/13/17:32
 * Copyright (c) 2021,
 */
public class Test03 {
    public static void main(String[] args) {
        //1.使用匿名内部类调用
        new AcanthopanaxInterface() {
            @Override
            public void get() {
                System.out.println("get");
            }
        }.get();
        AcanthopanaxInterface acanthopanaxInterface=   ()->{
            System.out.println("使用lamdba表达式调用方法");
        };
        acanthopanaxInterface.get();

    }