package com.progressoft.clustereddata.warehouse.clustereddatawarehouse.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Builder
public class DealDetail {

    private String uuid;
    private String fromCurrencyCode;
    private String toCurrencyCode;
    private BigDecimal amount;
    private Timestamp timestamp;
}
