package com.minhaz.java.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deliverable implements Serializable {
    private static final long serialVersionUID = 2L;

    private void writeObject(ObjectOutputStream oos) throws IOException {
        System.out.println("Custom serialization logic invoked.");
    }

    // Custom deserialization logic, It will be called only if we have implemented Serializable instead of Externalizable.
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        System.out.println("Custom deserialization logic invoked.");
    }
}
