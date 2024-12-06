package com.example.hospital.database;

import com.example.hospital.model.Hospital;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Hospital> hospitals = new ArrayList<>();

    public List<Hospital> getHospitals() {
        return hospitals;
    }
}
