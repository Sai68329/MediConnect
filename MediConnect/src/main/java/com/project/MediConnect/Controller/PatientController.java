package com.project.MediConnect.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.MediConnect.Entity.Appointment;
import com.project.MediConnect.Repository.AppointmentRepository;

@RestController
@RequestMapping("api/patient")
public class PatientController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/appointments")
    public List<Appointment> getAppointments(Principal principal){
        return appointmentRepository.findByPatientUsername(principal.getName());
    }
    
}
