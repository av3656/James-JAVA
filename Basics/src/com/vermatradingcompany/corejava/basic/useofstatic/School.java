package com.vermatradingcompany.corejava.basic.useofstatic;

public class School {
    public static School school = new School();

    private School() {

    }

    public static School getInstance() {
        return school;
    }
}
//Upper code is used to make class private and cannot be used anywhere else.