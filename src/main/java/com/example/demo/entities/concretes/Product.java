package com.example.demo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor

public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "product_id")
        private Integer id;

//        @Column(name = "category_id")
//        private Integer categoryId;

        @Column(name = "product_name")
        private String productName;

        @Column(name = "unit_price")
        private Double unitPrice;

        @Column(name = "units_in_stock")
        private Double unitsInStock;

        @Column(name = "quantity_per_unit")
        private String quantityPerUnit;

        @ManyToOne()
        @JoinColumn(name="category_id")
        public Category category;
}



















