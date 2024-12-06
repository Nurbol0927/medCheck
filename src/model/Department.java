package com.example.hospital.model;

import java.util.List;

public class Department {
    private Long id;
    private String departmentName;
    private List<Doctor> doctors;

    public Department(Long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    // Геттеры и сеттеры
}
