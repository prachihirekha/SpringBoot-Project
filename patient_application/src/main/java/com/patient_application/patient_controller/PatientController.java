package com.patient_application.patient_controller;

import com.patient_application.model.Patient;
import com.patient_application.patient_service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class PatientController {
 @Autowired
    private PatientService patientService;

    @PostMapping( "/patients/{value}")
    public List<Patient> insertRandom(@PathVariable("value") int value){
        System.out.println("insert successfully");
        return patientService.insertedPatient(value);
 }
 @PostMapping("/patient")
        public Patient insertSinglePatient(@RequestBody Patient patient){
        return patientService.insertSinglePatient(patient);
 }
    @GetMapping("/get_all_patient")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatient();
    }
    @GetMapping("/get_by_id/{id}")
    public Optional<Patient>  getById(@PathVariable("id") int id){
        return patientService.getById(id);

    }
    @DeleteMapping("delete_by_id/{id}")
    public void delete(@PathVariable("id") int id){
        System.out.println("delete Successfully");
         patientService.deleteById(id);
    }
    @PutMapping("/update/{id}")
    public Optional<Patient> updatePatient(@PathVariable("id") int id,@RequestBody Patient patient){
        return  patientService.updatePatient(id,patient);
    }


}

