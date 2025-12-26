package com.epoint.walletepoint.entity;

import com.epoint.walletepoint.service.impl.enums.PaymentProviderType;
import com.epoint.walletepoint.service.impl.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(
        name = "payments",
        indexes = {
                @Index(name = "idx_payment_provider_ref", columnList = "providerReference", unique = true)
        }
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentProviderType provider;

    @Column(nullable = false)
    private String providerReference;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus status;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    private WalletEntity wallet;

    public void markSuccess() {
        this.status = PaymentStatus.SUCCESS;
    }

    public void markFailed() {
        this.status = PaymentStatus.FAILED;
    }

}
