package com.dentists.microservices.clinic.controller;

import com.dentists.microservices.clinic.dto.ClinicRequest;
import com.dentists.microservices.clinic.dto.ClinicResponse;
import com.dentists.microservices.clinic.model.Clinic;
import com.dentists.microservices.clinic.service.ClinicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clinic")
@RequiredArgsConstructor
public class ClinicController {

    private final ClinicService clinicService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClinicResponse createClinic(@RequestBody ClinicRequest clinicRequest){
        return clinicService.createClinic(clinicRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClinicResponse> getAllClinics(){
        return clinicService.getAllClinics();
    }
}
