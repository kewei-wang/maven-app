package com.koway.app.mbeantest;

import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

/**
 * Created by kowaywang on 16/10/29.
 */
public class HelloAgent {

    public static void main(String[] args) throws Exception {

        MBeanServer server = MBeanServerFactory.createMBeanServer();

        ObjectName objectName = new ObjectName("koway:name=HelloWorld");

        server.registerMBean(new Hello(),objectName);

        ObjectName adapterName = new ObjectName("HelloAgent:name=htmladapter,port=8082");

        HtmlAdaptorServer adaptor = new HtmlAdaptorServer();

        server.registerMBean(adaptor,adapterName);

        adaptor.start();

        System.out.println("start...");
    }

}
