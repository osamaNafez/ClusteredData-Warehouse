package com.progressoft.clustereddata.warehouse.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class DealDetailRequest {

    @NotNull(message = "from currency code can't be null")
    @NotBlank(message = "from currency code can't be empty")
    private String fromCurrencyCode;

    @NotNull(message = "to currency code can't be null")
    @NotBlank(message = "to currency code can't be empty")
    private String toCurrencyCode;

    @NotNull(message = "amount can't be null")
    private BigDecimal amount;

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
}
