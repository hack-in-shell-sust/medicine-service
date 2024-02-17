package com.example.medicineservice.data.entity;


import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "medicine_shop")
public class MedicineShop {

    @EmbeddedId
    private MedicineShopId id;

    @ManyToOne
    @MapsId("medicineId")
    @JoinColumn(name = "medicine_id", insertable=false, updatable=false)
    private Medicine medicine;

    @ManyToOne
    @MapsId("shopId")
    @JoinColumn(name = "shop_id", insertable=false, updatable=false)
    private Shop shop;
}
