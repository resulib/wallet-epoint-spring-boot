package com.epoint.walletepoint.repository;

import com.epoint.walletepoint.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

    Optional<PaymentEntity> findByProviderReference(String providerReference);
}
