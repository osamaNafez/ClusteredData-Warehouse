package com.progressoft.clustereddata.warehouse.clustereddatawarehouse.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "DEAL_DETAIL")
public class DealDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "UUID")
    private String uuid;

    @Column(name = "FROM_CURRENCY")
    private String fromCurrencyCode;

    @Column(name = "TO_CURRENCY")
    private String toCurrencyCode;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "TIMESTAMP")
    private Timestamp timestamp;

    public DealDetailEntity(){
    }
    public Long getId(){
        return id;
    }
}
