package com.progressoft.clustereddata.warehouse.entity;

import javax.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.sql.Timestamp;


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

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public String getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
