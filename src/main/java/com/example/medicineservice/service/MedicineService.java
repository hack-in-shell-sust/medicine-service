package com.example.medicineservice.service;

import com.example.medicineservice.data.entity.Medicine;
import com.example.medicineservice.data.repository.MedicineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicineService extends BaseService {
    private final MedicineRepository medicineRepository;

    public List<Medicine> getMedicines() {
        return medicineRepository.findAll();
    }
}
