package com.example.medicineservice.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
public class MedicineShopId implements Serializable {

    @Column(name = "medicine_id")
    private Long medicineId;

    @Column(name = "shop_id")
    private Long shopId;
}
