package com.example.hospital.main;

import com.example.hospital.database.Database;
import com.example.hospital.model.Hospital;
import com.example.hospital.service.HospitalService;
import com.example.hospital.service.impl.HospitalServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        HospitalService hospitalService = new HospitalServiceImpl(database);

        Hospital hospital = new Hospital(
                1L,
                "PEAKSOFT",
                "Гражданская,119",
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
        );

        hospitalService.addHospital(hospital);

        System.out.println("Hospitals: " + hospitalService.getAllHospitals());
    }
}
