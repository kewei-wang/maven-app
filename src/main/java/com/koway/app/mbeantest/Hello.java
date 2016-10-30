package com.koway.app.mbeantest;

/**
 * Created by kowaywang on 16/10/29.
 */
public class Hello implements HelloMBean {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void printHello() {
        System.out.println("Hello World" + name);

    }

    @Override
    public void printHello(String whoName) {
        System.out.println("Hello " + whoName);
    }
}
