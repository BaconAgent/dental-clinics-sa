package com.dentists.microservices.clinic.service;


import com.dentists.microservices.clinic.dto.ClinicRequest;
import com.dentists.microservices.clinic.dto.ClinicResponse;
import com.dentists.microservices.clinic.model.Clinic;
import com.dentists.microservices.clinic.repository.ClinicRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ClinicService {

    private final ClinicRepository clinicRepository;

    public ClinicResponse createClinic(ClinicRequest clinicRequest) {
        Clinic clinic = Clinic.builder()
                .name(clinicRequest.name())
                .address(clinicRequest.address())
                .build();
        clinicRepository.save(clinic);
        log.info("Clinic created");
        return new ClinicResponse(clinic.getId(),clinic.getName(),clinic.getAddress());
    }

    public List<ClinicResponse> getAllClinics() {
        return clinicRepository.findAll()
                .stream().map(clinic -> new ClinicResponse(clinic.getId(),clinic.getName(),clinic.getAddress()))
                .toList();
    }
}
