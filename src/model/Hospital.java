package com.example.hospital.model;

import java.util.List;

public class Hospital {
    private Long id;
    private String hospitalName;
    private String address;
    private List<Department> departments;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(Long id, String hospitalName, String address, List<Department> departments, List<Doctor> doctors, List<Patient> patients) {
        this.id = id;
        this.hospitalName = hospitalName;
        this.address = address;
        this.departments = departments;
        this.doctors = doctors;
        this.patients = patients;
    }

    public Long getId() {
        return id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public List<Department> getDepartments() {
        return departments;
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return "Hospital{id=" + id +
                ", hospitalName='" + hospitalName + '\'' +
                ", address='" + address + '\'' +
                ", departments=" + departments.size() +
                ", doctors=" + doctors.size() +
                ", patients=" + patients.size() + '}';
    }
}
