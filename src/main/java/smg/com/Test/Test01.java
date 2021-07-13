package smg.com.Test;

import smg.com.JDK8InterfaceImpl;
import smg.com.JDK8interface;

/**
 * Project Name: one2
 * File Name: smg.com.Test.Test01
 *
 * @version 1.0
 * @author:wenerduo
 * @Date: 2021/07/13/15:37
 * Copyright (c) 2021,
 */
public class Test01 {
    public static void main(String[] args) {
        JDK8InterfaceImpl jdk8Interface1 = new JDK8InterfaceImpl();
        jdk8Interface1.defaultget();
       jdk8Interface1.add();
       JDK8interface.staticDel();
    }

}

