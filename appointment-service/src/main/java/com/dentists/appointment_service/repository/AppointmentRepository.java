package com.dentists.appointment_service.repository;

import com.dentists.appointment_service.entity.AppointmentEntity;
import com.dentists.appointment_service.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long> {
    List<Appointment> findAppointmentsByPatientId(Long patientId);
}
