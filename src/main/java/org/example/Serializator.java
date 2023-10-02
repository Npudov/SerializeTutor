package org.example;

import java.io.*;
import java.lang.reflect.Field;

public class Serializator {
    // Метод для сериализации объекта
    public static byte[] serialize(Object obj) throws IOException, IllegalAccessException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        // Получаем все поля объекта с использованием Reflection API
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // Разрешаем доступ к приватным полям
            objectOutputStream.writeObject(field.getName()); // Записываем имя поля
            objectOutputStream.writeObject(field.get(obj)); // Записываем значение поля
        }

        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    // Метод для десериализации объекта
    public static Object deserialize(byte[] data, Class<?> otherClass) throws Exception{
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        Object obj = otherClass.getDeclaredConstructor().newInstance(); // Создаем объект нужного класса

        while (byteArrayInputStream.available() > 0) {
            String fieldName = (String) objectInputStream.readObject(); // Читаем имя поля
            Object fieldValue = objectInputStream.readObject(); // Читаем значение поля

            // Получаем поле по имени с использованием Reflection API и устанавливаем его значение
            Field field = otherClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(obj, fieldValue);
        }

        return obj;
    }
}

