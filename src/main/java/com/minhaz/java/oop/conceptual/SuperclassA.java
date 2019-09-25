package com.minhaz.java.oop.conceptual;

class SuperclassA {
    public SuperclassA() { // (1)
        System.out.println("Default Constructor in SuperclassA");
    }
}

class SubclassB extends SuperclassA {
    SubclassB() { // (2) Default constructor
        this(3);
        System.out.println("Default constructor in SubclassB");
    }

    SubclassB(int i) { // (3) Non-default constructor
        System.out.println("Non-default constructor in SubclassB");
        value = i;
    }

    //Instance initializer block
    {
        System.out.println("Instance initializer block in SubclassB");
        value = 2;
    }

    private int value = initializerExpression();

    private int initializerExpression() {
        System.out.println("Instance initializer expression in SubclassB");
        return 1;
    }
}

class ObjectConstruction {
    public static void main(String[] args) {
        SubclassB objRef = new SubclassB(); // (8) System.out.println("value: " + objRef.value);
    }
}