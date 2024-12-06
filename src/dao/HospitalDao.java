package com.example.hospital.dao;

import com.example.hospital.model.Hospital;
import java.util.List;

public interface HospitalDao {
    String addHospital(Hospital hospital);
    Hospital findHospitalById(Long id);
    List<Hospital> getAllHospitals();
    String deleteHospitalById(Long id);
}
