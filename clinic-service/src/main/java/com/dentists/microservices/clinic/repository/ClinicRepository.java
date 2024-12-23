package com.dentists.microservices.clinic.repository;

import com.dentists.microservices.clinic.model.Clinic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClinicRepository extends MongoRepository<Clinic, String> {
}
