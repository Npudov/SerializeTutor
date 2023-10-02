package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Создаем объект для сериализации
            InfoAccount obj1 = new InfoAccount("John",  "SPB", 20, "dskjk@ya.ru");

            // Сериализуем объект в байтовый массив
            Date startTime = new Date();
            byte[] serializedData = Serializator.serialize(obj1);
            Date endTime = new Date();
            long elapsed = endTime.getTime() - startTime.getTime();
            System.out.println("Time serialized: " + elapsed + " ms");

            try (FileOutputStream fos = new FileOutputStream("serializedData.bin")){
                fos.write(serializedData);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Десериализуем объект из байтового массива
            startTime = new Date();
            InfoAccount obj2 = (InfoAccount) Serializator.deserialize(serializedData, InfoAccount.class);
            endTime = new Date();
            elapsed = endTime.getTime() - startTime.getTime();
            System.out.println("Time deserialized: " + elapsed + " ms");

            System.out.println("Original object: " + obj1);
            System.out.println("Deserialized object: " + obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
