package com.patient_application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder
@Table(name = "patients_details")
public class Patient {
    @Id
    @GeneratedValue
    private  int id;
    private String firstName;
    private String lastName;
   // private String MiddleInitial;
   // private String Address;
    private String city;
    private String state;
    private long Phone;
    private  String disease;
}
