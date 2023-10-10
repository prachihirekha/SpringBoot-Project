package com.patient_application.patient_service;

import com.patient_application.model.Patient;
import com.patient_application.repository.PatientRepository;
import com.patient_application.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> insertedPatient(int size) {
        List<Patient> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
           Patient patient=Patient.builder().Phone(GeneratePhoneNo.generatePhoneNumber()).state(GenerateStateName.generateStateName())
                   .city(GenerateCity.generateCity()).firstName(GenerateFirstName.generateName()).disease(GenerateDisease.generateDisease()).lastName(GenerateLastName.generateLastName()).build();
           list.add(patient);
        }
        return patientRepository.saveAll(list);
    }
    public List<Patient> getAllPatient(){
        return patientRepository.findAll();
    }

    public Optional<Patient> getById(int id) {
        return patientRepository.findById(id);
    }

    public void deleteById(int id) {
      patientRepository.deleteById(id);
    }

    public Optional<Patient> updatePatient(int id, Patient patient) {
       Optional <Patient> patientDetails=patientRepository.findById(id);
       if (patientDetails!=null){
           patientRepository.save(patient);
       }
       return patientDetails;
    }
}
