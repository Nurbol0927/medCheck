package com.example.hospital.model;

public class Patient {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    public Patient(Long id, String firstName, String lastName, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

}
