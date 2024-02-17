package com.example.medicineservice.data.repository;

import com.example.medicineservice.data.entity.MedicineShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineShopRepository extends JpaRepository<MedicineShop, Long> {

}
