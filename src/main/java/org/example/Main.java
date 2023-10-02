package org.example;

import java.io.*;

public class Main
{
    /*public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        //serialization();
        deserialization();
    }

    private static void serialization() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Raya_Test.txt"));
            Raya_Test raya = new Raya_Test("dsfd", 1);
            objectOutputStream.writeObject(raya);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void deserialization() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Raya_Test.txt"));
            Raya_Test raya = (Raya_Test) objectInputStream.readObject();
            System.out.println("name: " + raya.name + " count: " + raya.count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Raya_Test implements Serializable {
    String name;
    int count;

    Raya_Test(String name, int count) {
        this.name = name;
        this.count = count;
    }*/


}