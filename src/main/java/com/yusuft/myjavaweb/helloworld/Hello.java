package com.yusuft.myjavaweb.helloworld;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class Hello {
    final String world = "Hello World 2013!";

    public String getworld() {
        return world;
    }
}
