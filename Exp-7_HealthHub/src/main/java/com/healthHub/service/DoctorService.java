
package com.healthHub.service;

import com.healthHub.entity.Doctor;
import com.healthHub.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Page<Doctor> getAllDoctors(int page, int size) {

        Pageable pageable =
                PageRequest.of(page, size, Sort.by("id").descending());

        return doctorRepository.findAll(pageable);
    }

    public Page<Doctor> getDoctorsBySpecialization(
            String specialization,
            int page,
            int size) {

        Pageable pageable = PageRequest.of(page, size);

        return doctorRepository
                .findBySpecialization(specialization, pageable);
    }
    public Page<Doctor> getExperiencedDoctors(
            int experience,
            int page,
            int size) {

        Pageable pageable = PageRequest.of(page, size);

        return doctorRepository
                .findByExperienceGreaterThan(experience, pageable);
    }
}
