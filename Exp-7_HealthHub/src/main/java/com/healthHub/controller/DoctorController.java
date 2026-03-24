package com.healthHub.controller;

import com.healthHub.entity.Doctor;
import com.healthHub.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public Page<Doctor> getDoctors(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        return doctorService.getAllDoctors(page, size);
    }


    @GetMapping("/specialization")
    public Page<Doctor> getDoctorsBySpec(
            @RequestParam String spec,
            @RequestParam int page,
            @RequestParam int size) {

        return doctorService
                .getDoctorsBySpecialization(spec, page, size);
    }


    @GetMapping("/experience")
    public Page<Doctor> getExperiencedDoctors(
            @RequestParam int exp,
            @RequestParam int page,
            @RequestParam int size) {

        return doctorService
                .getExperiencedDoctors(exp, page, size);
    }
}
