package com.koway.app.mbeantest;

/**
 * Created by kowaywang on 16/10/29.
 */
public interface HelloMBean {

    public String getName();
    public void setName(String name);

    public void printHello();
    public void printHello(String whoName);

}
