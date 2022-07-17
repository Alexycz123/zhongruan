package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-28-16:41  
*/

public class FileName {

    private String name;

    private String endName;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FileName{" +
                "name='" + name + '\'' +
                ", endName='" + endName + '\'' +
                '}';
    }

    public FileName(String name, String endName) {
        this.name = name;
        this.endName = endName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndName() {
        return endName;
    }

    public void setEndName(String endName) {
        this.endName = endName;
    }
}
