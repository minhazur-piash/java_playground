package com.minhaz.java.java8;

interface Named {
    default String getName() {
        return getClass().getName() + "_" + hashCode();
    }
}

class Student implements Named {
    @Override
    public String getName() {
        return "Student...";
    }
}

public interface Robot {
    double VERSION = 1.0;

    default String manufacturerName() {
        return "xylon";
    }
}


class Runner {
    public static void main(String[] args) {
        System.out.println("new Student().getName() = " + new Student().getName());
    }
}
