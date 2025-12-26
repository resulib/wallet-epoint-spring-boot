package com.epoint.walletepoint.mapper;

import com.epoint.walletepoint.dto.TransactionDto;
import com.epoint.walletepoint.entity.WalletTransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    @Mapping(target = "transactionId", source = "id")
    TransactionDto toDto(WalletTransactionEntity transaction);
}
