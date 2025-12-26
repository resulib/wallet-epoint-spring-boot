package com.epoint.walletepoint.repository;

import com.epoint.walletepoint.entity.WalletEntity;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<WalletEntity, Long> {

    Optional<WalletEntity> findByUserId(Long userId);

    /**
     * FINTECH CRITICAL
     * Transfer zamanı race condition qarşısını alır
     */
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select w from WalletEntity w where w.id = :walletId")
    Optional<WalletEntity> findByIdForUpdate(@Param("walletId") Long walletId);
}
