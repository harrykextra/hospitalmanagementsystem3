package com.javatechy.controller.doctor;

import com.javatechy.model.doctor.Doctor;
import com.javatechy.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> getDOctors(){
        return doctorService.getDoctors();
    }
}
