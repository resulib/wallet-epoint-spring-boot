package com.epoint.walletepoint.repository;

import com.epoint.walletepoint.entity.WalletEntity;
import com.epoint.walletepoint.entity.WalletTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository
        extends JpaRepository<WalletTransactionEntity, Long> {

    List<WalletTransactionEntity> findAllByWallet(WalletEntity wallet);
}
