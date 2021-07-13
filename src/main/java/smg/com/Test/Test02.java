package smg.com.Test;

import smg.com.service.Orderservice;

/**
 * Project Name: one2
 * File Name: Test02
 *
 * @version 1.0
 * @author:wenerduo
 * @Date: 2021/07/13/17:09
 * Copyright (c) 2021,
 */
public class Test02 {
    public static void main(String[] args) {
//        //匿名内部类
//        new Orderservice() {
//            @Override
//            public void get() {
//          System.out.println("get");
//            }
//        };
        new Orderservice() {
            @Override
            public void get() {
                System.out.println("get");
            }
        }.get();
    }
}
