package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person<monthlySalary> {
    private String name;
    private int age;
    private double monthlySalary;
    private char middleInitial;
    private long eyeColorDepth;
    private Boolean female;
    private Double weight;

    public Person() {
        this.name = "Leon";
        this.age = Integer.MAX_VALUE;

    }

        public Person (Double monthlySalary) {
    this.monthlySalary = monthlySalary;
        }

    // these are constructor methods
    public Person(int age) {
        this.age = age;
    }

    public Person(long eyeColorDepth) {
        this.eyeColorDepth = eyeColorDepth;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String sex) {
        this.female = female;

    }

    public Person(double weight) {
        this.weight = weight;
    }

    public Person(char middleInitial) {
        this.middleInitial = middleInitial;
    }




    //void because they don't do anything or return anything.
    //they're called
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void setFemale(Boolean female) {
        this.female = female;
    }

    public void setEyeColorDepth(long eyeColorDepth) {
        this.eyeColorDepth = eyeColorDepth;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getName() {
        return name;
    }

    public long getEyeColorDepth() {
        return eyeColorDepth;
    }

    public Boolean getFemale() {
        return female;
    }

    public Integer getAge() {
        return age;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
}

}



