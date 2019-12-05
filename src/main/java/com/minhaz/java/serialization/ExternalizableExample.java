package com.minhaz.java.serialization;

import java.io.*;

public class ExternalizableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        runForPerson();
//        runForEmployee();
    }

    private static void runForPerson() throws IOException, ClassNotFoundException {
        Person person = new Person("Minhazur", "Rahman");
        System.out.println("Person before serialization  => " + person.toString());
        // Serialization
        serialize(person);
        // Deserialization
        Person deserializedPersonObj = deserializePerson();
        System.out.println("Person after deserialization => " + deserializedPersonObj.toString());
    }

    private static void runForEmployee() throws IOException, ClassNotFoundException {
        Employee empObj = new Employee("Minhazur", "Rahman", 28, "IT");
        System.out.println("Object before serialization  => " + empObj.toString());
        // Serialization
        serialize(empObj);
        // Deserialization
        Employee deserializedEmpObj = deserializeEmployee();
        System.out.println("Object after deserialization => " + deserializedEmpObj.toString());
    }

    // Serialization code
    static void serialize(Employee empObj) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("data.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(empObj);
        }
    }

    // Deserialization code
    static Employee deserializeEmployee() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("data.obj");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Employee) ois.readObject();
        }
    }

    // Serialization code
    static void serialize(Person person) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("person.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);
        }
    }

    // Deserialization code
    static Person deserializePerson() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("person.obj");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Person) ois.readObject();
        }
    }
}