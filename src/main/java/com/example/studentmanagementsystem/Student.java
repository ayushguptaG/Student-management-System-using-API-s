package com.example.studentmanagementsystem;

public class Student {
    private String name;
    private String id;
    private int age;
    private String course;

    public Student(String name, String id, int age, String course){
        this.name= name;
        this.id= id;
        this.age= age;
        this.course= course;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
