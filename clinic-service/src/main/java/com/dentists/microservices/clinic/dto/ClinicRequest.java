package com.dentists.microservices.clinic.dto;

import java.time.Instant;

public record ClinicRequest(String id, String name, String address, Instant date,String subject) {
}
