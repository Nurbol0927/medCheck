package com.example.hospital.service;

import com.example.hospital.model.Hospital;
import com.example.hospital.model.Patient;
import java.util.List;
import java.util.Map;

public interface HospitalService {
    String addHospital(Hospital hospital);
    Hospital findHospitalById(Long id);
    List<Hospital> getAllHospitals();
    List<Patient> getAllPatientsFromHospital(Long id);
    String deleteHospitalById(Long id);
    Map<String, Hospital> getAllHospitalsByAddress(String address);
}
