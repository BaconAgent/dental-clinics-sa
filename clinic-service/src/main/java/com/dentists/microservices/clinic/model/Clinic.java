package com.dentists.microservices.clinic.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "clinic")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Clinic {
    @Id
    private String id;
    private String name;
    private String address;

}
