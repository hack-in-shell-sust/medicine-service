package com.example.medicineservice.domain.dto;

import lombok.Data;

@Data
public class NearestDoctorRequest {
    private Double latitude;
    private Double longitude;
}
