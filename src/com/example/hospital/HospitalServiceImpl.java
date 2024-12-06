package com.example.hospital.service.impl;

import com.example.hospital.database.Database;
import com.example.hospital.model.Hospital;
import com.example.hospital.model.Patient;
import com.example.hospital.service.HospitalService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HospitalServiceImpl implements HospitalService {
    private final Database database;

    public HospitalServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public String addHospital(Hospital hospital) {
        database.getHospitals().add(hospital);
        return "Hospital added successfully!";
    }

    @Override
    public Hospital findHospitalById(Long id) {
        return database.getHospitals()
                .stream()
                .filter(h -> h.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return database.getHospitals();
    }

    @Override
    public List<Patient> getAllPatientsFromHospital(Long id) {
        Hospital hospital = findHospitalById(id);
        return hospital != null ? hospital.getPatients() : List.of();
    }

    @Override
    public String deleteHospitalById(Long id) {
        boolean removed = database.getHospitals().removeIf(h -> h.getId().equals(id));
        return removed ? "Hospital deleted successfully!" : "Hospital not found.";
    }

    @Override
    public Map<String, Hospital> getAllHospitalsByAddress(String address) {
        return database.getHospitals()
                .stream()
                .filter(h -> h.getAddress().equalsIgnoreCase(address))
                .collect(Collectors.toMap(Hospital::getHospitalName, h -> h));
    }
}
