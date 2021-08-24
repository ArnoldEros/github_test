package com.eros.emtity;


public class Student {

    private Integer age;
    private String name;
    private Double salary;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Student(Integer age, String name, Double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Student() {
    }
}
