package com.epoint.walletepoint.dto;

import com.epoint.walletepoint.service.impl.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WalletDto {

    private Long walletId;
    private BigDecimal balance;
    private Currency currency;
}