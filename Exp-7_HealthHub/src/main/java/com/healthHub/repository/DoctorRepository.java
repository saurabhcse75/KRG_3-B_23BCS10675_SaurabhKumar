package com.healthHub.repository;

import com.healthHub.entity.Doctor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Page<Doctor> findBySpecialization(String specialization, Pageable pageable);

    Page<Doctor> findByExperienceGreaterThan(int experience, Pageable pageable);

}
