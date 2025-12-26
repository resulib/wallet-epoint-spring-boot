package com.epoint.walletepoint.dto;

import com.epoint.walletepoint.service.impl.enums.WalletTransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {

    private Long transactionId;
    private WalletTransactionType type;
    private BigDecimal amount;
    private LocalDateTime createdAt;

}
