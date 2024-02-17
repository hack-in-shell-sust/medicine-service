package com.example.medicineservice.controller;

import com.example.medicineservice.common.utils.IPUtils;
import com.example.medicineservice.data.entity.Medicine;
import com.example.medicineservice.service.MedicineService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( IPUtils.defaultUrl)
public class MedicineResource extends BaseResource {
    private final MedicineService medicineService;

    @GetMapping("/list")
    public List<Medicine> getAllMedicinesList() {
        List<Medicine> medicineList = medicineService.getMedicines();
        return medicineList;
    }
}
