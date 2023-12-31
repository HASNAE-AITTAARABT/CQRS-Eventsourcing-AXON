package com.enset.cqrsaxon.commands.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DebitAccountRequestDTO {
    private String accountId;
    private BigDecimal amount;
    private String currency;
}
