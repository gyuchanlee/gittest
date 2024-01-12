package io;

import java.io.Serializable;

/**
 * 2024-01-08
 */
public class PersonDTO implements Serializable {
    // 직렬화, 역직렬화 수행하기 위해 마커 인터페이스 구현. 없다면 에러.
    // Exception in thread "main" java.io.NotSerializableException: io.PersonDTO

    private String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
