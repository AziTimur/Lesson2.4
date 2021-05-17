package com.company;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private Integer age;
    private Boolean sex;




    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
