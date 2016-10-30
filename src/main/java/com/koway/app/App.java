package com.koway.app;

import com.alibaba.fastjson.JSON;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        People p = new People();
        p.setId(1l);
        p.setName("kkk");

        People p2 = new People();
        p2.setId(2l);
        p2.setName("koway2");


        Group g = new Group();
        g.name="qwert";
        g.peopleList.add(p);
        g.peopleList.add(p2);

        System.out.println(JSON.toJSONString(g));

        System.out.println("Hello World!");
    }
}
