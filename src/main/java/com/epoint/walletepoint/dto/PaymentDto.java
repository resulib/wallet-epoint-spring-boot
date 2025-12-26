package com.epoint.walletepoint.dto;

import com.epoint.walletepoint.service.impl.enums.PaymentProviderType;
import com.epoint.walletepoint.service.impl.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {

    private Long paymentId;
    private PaymentProviderType provider;
    private PaymentStatus status;
    private BigDecimal amount;

}

